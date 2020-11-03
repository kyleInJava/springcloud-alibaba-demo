package com.kyle.alibaba.service.account.service.impl;

import com.kyle.alibaba.service.account.dao.AccountMapper;
import com.kyle.alibaba.service.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 小邓
 * @date 2020/10/27 - 10:53
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void debit(String userId, int money) {
        accountMapper.debit(userId,money);
    }
}
