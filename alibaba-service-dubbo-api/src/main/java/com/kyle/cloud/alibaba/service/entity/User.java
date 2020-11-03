package com.kyle.cloud.alibaba.service.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 小邓
 * @date 2020/10/29 - 14:28
 */
@Data
public class User implements Serializable {

    private String name;

    private int age;

}
