package com.xdw.springbootshardingjdbc.controller;


import com.xdw.springbootshardingjdbc.entity.Order1;
import com.xdw.springbootshardingjdbc.service.impl.Order1ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wdx
 * @since 2020-06-08
 */
@RestController
@RequestMapping("/order1")
public class Order1Controller {

    @Autowired
    private Order1ServiceImpl order1Service;

    @RequestMapping
    public List<Order1> list(){
        Order1 order1 = new Order1();
        order1.setOrderId(4L);
        order1.setPrice(BigDecimal.valueOf(1));
        order1Service.save(order1);
        return order1Service.list();
    }

}
