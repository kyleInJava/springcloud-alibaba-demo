package com.kyle.cloud.alibaba.service.storage.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author 小邓
 * @date 2020/10/27 - 10:56
 */
@Mapper
public interface StorageMapper {

    @Update("update t_storage set count = count - #{count} where code = #{commodityCode}")
    int deduct(@Param("commodityCode") String commodityCode, @Param("count")int count);
}
