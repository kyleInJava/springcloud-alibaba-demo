package com.kyle.cloud.alibaba.service.consumer.service;

import com.kyle.cloud.alibaba.service.consumer.service.impl.ProviderServiceFallBackHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 小邓
 * @date 2020/10/24 - 10:46
 */
@FeignClient(value="service-provider",fallback = ProviderServiceFallBackHandler.class)
@Primary
public interface ProviderService {

    @GetMapping("/provider/info")
    String info();

}
