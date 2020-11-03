package com.kyle.alibaba.service.account.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author 小邓
 * @date 2020/10/27 - 10:56
 */
@Mapper
public interface AccountMapper {

    @Update("update t_account set money = money-#{money} where user_id = #{userId}")
    int debit(@Param("userId") String userId, @Param("money") int money);
}
