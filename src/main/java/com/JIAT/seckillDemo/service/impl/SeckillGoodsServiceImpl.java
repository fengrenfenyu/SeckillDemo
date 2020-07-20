package com.JIAT.seckillDemo.service.impl;

import com.JIAT.seckillDemo.mapper.SeckillGoodsMapper;
import com.JIAT.seckillDemo.mapper.SeckillOrderMapper;
import com.JIAT.seckillDemo.pojo.*;
import com.JIAT.seckillDemo.service.SeckillGoodsService;
import com.JIAT.seckillDemo.thread.OrderCreateThead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Order;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

@Service
@Transactional  //事务注解
public class SeckillGoodsServiceImpl implements SeckillGoodsService {

    @Autowired
    private IdWorker idWorker;  //ID生成器

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private SeckillGoodsMapper seckillGoodsMapper;

    @Autowired
    private Executor executor;

    @Autowired
    private OrderCreateThead orderCreateThead;

    @Override
    public List<SeckillGoods> findAll() {
        return   redisTemplate.opsForHash().values(SeckillGoods.class.getSimpleName());
    }

    @Override
    public SeckillGoods findOne(Long id) {
        return (SeckillGoods)redisTemplate.opsForHash().get(SeckillGoods.class.getSimpleName(),id);
    }

    @Override
    public Msg saveOrder(Long id, String userId) {
        //从用户set集合中判断用户是否下单
        Boolean member = redisTemplate.opsForSet().isMember(SystemConst.CONST_USER_ID_PRBFIX+id,userId);
        //如果有正在排队或者未支付的，提示用户你正在排队或有顶顶那未支付
        //未支付的信息存储在OrderRecord中
        if(member){
            return  new Msg(false,"对不起你正在等待支付");
        }
        //解决超卖：
        //通过队列的方式，队列中的id个数就是商品的库存，每个线程只能通过队列得到id时才可以获取商品，当队列中已经没有id时，线程拿不到
        Long goodsId = (Long)redisTemplate.opsForList().rightPop(SystemConst.CONST_SECKILLGOODS_ID_PRBFIX+id);
        if(goodsId==null){
            return new Msg(false,"已售罄");
        }
        //将用户放入该商品的用户列表中
        redisTemplate.opsForSet().add(SystemConst.CONST_USER_ID_PRBFIX+id,userId);
        //创建OrderRecord对象记录下单商品和用户，保存到redis的OrderRecord队列中
        OrderRecord orderRecord = new OrderRecord(id,userId);
        redisTemplate.opsForList().leftPush(OrderRecord.class.getSimpleName(),orderRecord);
        //通过线程执行下单
        executor.execute(orderCreateThead);

        return new Msg(true,"秒杀成功，前往支付");
    }
}
