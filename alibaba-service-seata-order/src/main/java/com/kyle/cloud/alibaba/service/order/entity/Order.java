package com.kyle.cloud.alibaba.service.order.entity;

import lombok.Data;

/**
 * @author 小邓
 * @date 2020/10/27 - 14:21
 */
@Data
public class Order {

    private long id;

    private String userId;

    private String code;

    private int count;

    private int money;
}
