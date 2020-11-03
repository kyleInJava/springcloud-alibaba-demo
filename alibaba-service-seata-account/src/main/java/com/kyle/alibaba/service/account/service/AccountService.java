package com.kyle.alibaba.service.account.service;

/**
 * @author 小邓
 * @date 2020/10/27 - 10:52
 */
public interface AccountService {

    void debit(String userId, int money);
}
