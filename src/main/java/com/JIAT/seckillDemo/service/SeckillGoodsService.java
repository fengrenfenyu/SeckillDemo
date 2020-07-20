package com.JIAT.seckillDemo.service;

import com.JIAT.seckillDemo.pojo.Msg;
import com.JIAT.seckillDemo.pojo.SeckillGoods;

import java.util.List;

public interface SeckillGoodsService {
    List<SeckillGoods> findAll();

    SeckillGoods findOne(Long id);

    Msg saveOrder(Long id, String userId);
}
