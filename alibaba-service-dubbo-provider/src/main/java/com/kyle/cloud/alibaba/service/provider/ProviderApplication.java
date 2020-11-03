package com.kyle.cloud.alibaba.service.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 小邓
 * @date 2020/10/28 - 17:30
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo
public class ProviderApplication {
    
    public static void main (String[] args){
        SpringApplication.run(ProviderApplication.class,args);
    }
}
