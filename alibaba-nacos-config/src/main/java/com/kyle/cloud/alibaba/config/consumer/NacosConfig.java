package com.kyle.cloud.alibaba.config.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 小邓
 * @date 2020/10/21 - 11:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfig {

    public static void main (String[] args){
        SpringApplication.run(NacosConfig.class,args);
    }
}
