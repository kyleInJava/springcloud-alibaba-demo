package com.kyle.cloud.alibaba.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 小邓
 * @date 2020/10/21 - 10:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceProvider {
    public static void main (String[] args){
        SpringApplication.run(ServiceProvider.class,args);
    }
}
