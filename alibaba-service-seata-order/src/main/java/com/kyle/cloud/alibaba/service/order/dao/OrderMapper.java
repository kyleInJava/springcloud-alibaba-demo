package com.kyle.cloud.alibaba.service.order.dao;

import com.kyle.cloud.alibaba.service.order.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 小邓
 * @date 2020/10/27 - 10:56
 */
@Mapper
public interface OrderMapper {

    @Insert("insert into t_order(user_id,code,count,money) " +
            "values(#{order.userId},#{order.code},#{order.count},#{order.money})")
    int create(@Param("order") Order order);
}
