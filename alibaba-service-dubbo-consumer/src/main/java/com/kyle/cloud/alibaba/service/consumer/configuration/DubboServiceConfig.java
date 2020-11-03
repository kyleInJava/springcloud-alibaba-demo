package com.kyle.cloud.alibaba.service.consumer.configuration;

import com.kyle.cloud.alibaba.service.api.GreetingService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 小邓
 * @date 2020/10/30 - 12:08
 */
@Configuration
public class DubboServiceConfig {

    @Reference(version = "1.0.0")
    private GreetingService greetingService;

    @Bean
    public GreetingService greetingService(){
        return greetingService;
    }
}
