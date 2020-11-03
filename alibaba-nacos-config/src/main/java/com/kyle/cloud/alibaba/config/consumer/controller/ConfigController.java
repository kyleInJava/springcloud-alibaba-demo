package com.kyle.cloud.alibaba.config.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 小邓
 * @date 2020/10/21 - 11:26
 */
@RefreshScope
@RestController
@RequestMapping("config")
public class ConfigController {


    @Value("${config.info}")
    private String configInfo;

    @GetMapping("info")
    public String getInfo(){
        return configInfo;
    }
}
