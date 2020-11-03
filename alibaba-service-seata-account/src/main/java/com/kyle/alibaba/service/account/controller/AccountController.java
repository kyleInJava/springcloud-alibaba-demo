package com.kyle.alibaba.service.account.controller;

import com.kyle.alibaba.service.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小邓
 * @date 2020/10/27 - 11:10
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("debit")
    public String debit(@RequestParam String userId, @RequestParam int money){
        System.out.println(userId+"-"+money);
        accountService.debit(userId,money);
        return "扣减成功";
    }
}
