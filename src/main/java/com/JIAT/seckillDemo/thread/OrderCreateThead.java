package com.JIAT.seckillDemo.thread;

import com.JIAT.seckillDemo.mapper.SeckillGoodsMapper;
import com.JIAT.seckillDemo.pojo.IdWorker;
import com.JIAT.seckillDemo.pojo.OrderRecord;
import com.JIAT.seckillDemo.pojo.SeckillGoods;
import com.JIAT.seckillDemo.pojo.SeckillOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import java.util.Date;

@Component
public class OrderCreateThead implements Runnable{

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private SeckillGoodsMapper seckillGoodsMapper;

    @Override
    public void run() {
        OrderRecord o  = (OrderRecord) redisTemplate.opsForList().rightPop(OrderRecord.class.getSimpleName());
        if (o!=null){
            SeckillGoods good = (SeckillGoods) redisTemplate.opsForHash().get(SeckillGoods.class.getSimpleName(), o.getId());
            //生成秒杀订单
            SeckillOrder seckillOrder = new SeckillOrder();
            seckillOrder.setUerId(o.getUserId());
            seckillOrder.setSeckillId(good.getSellerId());
            seckillOrder.setSeckillId(idWorker.nextId());
            seckillOrder.setMoney(good.getCostPrice());//秒杀价
            seckillOrder.setCreateTime(new Date());
            seckillOrder.setStatus("0");
            //存入redis
            redisTemplate.opsForHash().put(SeckillOrder.class.getSimpleName(), o.getUserId(), seckillOrder);
            synchronized(OrderCreateThead.class) {
                good = (SeckillGoods) redisTemplate.opsForHash().get(SeckillGoods.class.getSimpleName(), o.getId());
                //秒杀库存减1
                good.setStockCount(good.getStockCount() - 1);
                //判断库存是否《=0
                if (good.getStockCount() <= 0) {
                    //秒杀商品更新到数据库，删除秒杀商品
                    seckillGoodsMapper.updateByPrimaryKey(good);
                    redisTemplate.opsForHash().delete(SeckillGoods.class.getSimpleName(), o.getId());
                } else {
                    redisTemplate.opsForHash().put(SeckillGoods.class.getSimpleName(), o.getId(), good);
                }
            }
        }
    }
}
