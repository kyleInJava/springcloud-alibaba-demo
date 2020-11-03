package com.kyle.cloud.alibaba.service.order.service.impl;

import com.kyle.cloud.alibaba.service.order.dao.OrderMapper;
import com.kyle.cloud.alibaba.service.order.entity.Order;
import com.kyle.cloud.alibaba.service.order.service.AccountService;
import com.kyle.cloud.alibaba.service.order.service.OrderService;
import com.kyle.cloud.alibaba.service.order.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 小邓
 * @date 2020/10/27 - 10:53
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private AccountService accountService;
    @Autowired
    private StorageService storageService;

    @GlobalTransactional(name="create_order",rollbackFor = Exception.class)
    @Override
    public void create(Order order) {
        accountService.debit(order.getUserId(),order.getMoney());
        storageService.deduct(order.getCode(),order.getCount());
        int i = 1/0;
        orderMapper.create(order);
    }
}
