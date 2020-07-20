package com.JIAT.seckillDemo.test;

import com.JIAT.seckillDemo.mapper.SeckillGoodsMapper;
import com.JIAT.seckillDemo.pojo.SeckillGoods;
import com.JIAT.seckillDemo.pojo.SeckillGoodsExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@RunWith(
        SpringJUnit4ClassRunner.class
)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class TaskTest {

    @Test
    public void testTask() throws IOException {
        while (true) {
            System.in.read();
        }
    }
}
