package com.kyle.cloud.alibaba.service.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 小邓
 * @date 2020/10/27 - 11:13
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.kyle.cloud.alibaba.service.order.dao")
public class OrderApplication {
    
    public static void main (String[] args){
        SpringApplication.run(OrderApplication.class,args);
    }
}
