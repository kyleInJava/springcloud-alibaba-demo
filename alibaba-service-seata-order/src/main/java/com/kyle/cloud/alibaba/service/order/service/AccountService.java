package com.kyle.cloud.alibaba.service.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 小邓
 * @date 2020/10/27 - 14:48
 */
@FeignClient("seata-account")
public interface AccountService {

    @RequestMapping("/account/debit")
    String debit(@RequestParam("userId") String userId, @RequestParam("money") int money);
}
