package com.kyle.cloud.alibaba.service.consumer.service.impl;

import com.kyle.cloud.alibaba.service.consumer.service.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @author 小邓
 * @date 2020/10/24 - 10:49
 */
@Component
public class ProviderServiceFallBackHandler implements ProviderService {
    @Override
    public String info() {
        return "熔断降级方法";
    }
}
