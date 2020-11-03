package com.kyle.cloud.alibaba.service.consumer.controller;

import com.kyle.cloud.alibaba.service.api.GreetingService;
import com.kyle.cloud.alibaba.service.entity.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小邓
 * @date 2020/10/29 - 9:17
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("greeting/{name}")
    public String greeting(@PathVariable("name") String name){
        return greetingService.sayHello(name);
    }

    @RequestMapping("user")
    public User getUserInfo(){
        return greetingService.getUserInfo();
    }
}
