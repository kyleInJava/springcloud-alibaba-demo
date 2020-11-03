package com.kyle.cloud.alibaba.service.order.controller;

import com.kyle.cloud.alibaba.service.order.entity.Order;
import com.kyle.cloud.alibaba.service.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 小邓
 * @date 2020/10/27 - 10:51
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("create")
    public String create(@RequestBody Order order){
        orderService.create(order);
        return "下单成功";
    }
}
