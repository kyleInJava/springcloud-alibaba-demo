package com.kyle.cloud.alibaba.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 小邓
 * @date 2020/10/21 - 11:26
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    private static final String PROVIDER_URL = "http://service-provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("info")
    public String getInfo(){
        return restTemplate.getForObject(PROVIDER_URL+"/provider/info",String.class);
    }
}
