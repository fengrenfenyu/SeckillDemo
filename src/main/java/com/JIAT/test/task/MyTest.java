package com.JIAT.test.task;
import com.JIAT.seckillDemo.mapper.SeckillGoodsMapper;
import com.JIAT.seckillDemo.pojo.SeckillGoods;
import com.JIAT.seckillDemo.pojo.SeckillGoodsExample;
import com.JIAT.seckillDemo.pojo.SystemConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class MyTest {
    @Autowired
    private SeckillGoodsMapper seckillGoodsMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Scheduled(cron="45 17 23 * * ?")
    public void toReids(){
        //1.查询商品，状态码为1，秒杀开始时间<=现在<结束时间
        Date date = new Date();
        SeckillGoodsExample example = new SeckillGoodsExample();
        SeckillGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo("1").andStockCountGreaterThan(0)
                .andStartTimeLessThanOrEqualTo(date)
                .andEndTimeGreaterThan(date);
        List<SeckillGoods> seckillGoods = seckillGoodsMapper.selectByExample(example);
        System.out.println(seckillGoods.size());

        //存入redis
        for(SeckillGoods good: seckillGoods){
//            redisTemplate.boundHashOps(SeckillGoods.class.getSimpleName()).put(good.getId(),good);
            redisTemplate.opsForHash().put(SeckillGoods.class.getSimpleName(),good.getId(),good);
            createQueuey(good.getId(),good.getStockCount());
        }

    }

    private void createQueuey(Long id, Integer stockCount) {
        if(stockCount>0){
            for(int i=0;i<stockCount;i++){
                redisTemplate.opsForList().leftPush(SystemConst.CONST_SECKILLGOODS_ID_PRBFIX+id,id);
            }
        }
    }
}
