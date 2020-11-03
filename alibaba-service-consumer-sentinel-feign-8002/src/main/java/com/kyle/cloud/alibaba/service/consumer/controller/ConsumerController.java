package com.kyle.cloud.alibaba.service.consumer.controller;

import com.kyle.cloud.alibaba.service.consumer.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小邓
 * @date 2020/10/24 - 10:45
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("info")
    public String info(){
        return providerService.info();
    }
}
