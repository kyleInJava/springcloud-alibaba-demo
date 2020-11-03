package com.kyle.cloud.alibaba.service.api;

import com.kyle.cloud.alibaba.service.entity.User;

/**
 * @author 小邓
 * @date 2020/10/29 - 9:08
 */
public interface GreetingService {

    String sayHello(String name);

    User getUserInfo();

}
