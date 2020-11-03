package com.kyle.cloud.alibaba.service.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 小邓
 * @date 2020/10/27 - 14:49
 */
@FeignClient("seata-storage")
public interface StorageService {

    @RequestMapping("/storage/deduct")
    String deduct(@RequestParam("commodityCode")  String commodityCode,@RequestParam("count") int count);
}
