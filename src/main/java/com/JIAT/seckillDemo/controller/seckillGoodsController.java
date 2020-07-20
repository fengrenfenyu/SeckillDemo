package com.JIAT.seckillDemo.controller;

import com.JIAT.seckillDemo.pojo.IdWorker;
import com.JIAT.seckillDemo.pojo.Msg;
import com.JIAT.seckillDemo.pojo.SeckillGoods;
import com.JIAT.seckillDemo.service.SeckillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.jws.Oneway;
import java.util.List;

@RestController
@RequestMapping("/seckillGoods")
public class seckillGoodsController {

    @Autowired
    private SeckillGoodsService seckillGoodsService;


    @GetMapping("/findAll")
    public List<SeckillGoods> findAll(){
        return seckillGoodsService.findAll();
    }

    @RequestMapping("/findOne/{id}")
    public SeckillGoods findOne(@PathVariable("id") Long id){
        System.out.println(id);
        return seckillGoodsService.findOne(id);
    }



    @RequestMapping("/saveOrder/{id}")
    public Msg saveOrder(@PathVariable("id") Long id){
        //模拟登陆用户
        String userId = "JIAT";
        return seckillGoodsService.saveOrder(id,userId);
    }
}
