package com.kyle.cloud.alibaba.service.storage.service.impl;

import com.kyle.cloud.alibaba.service.storage.dao.StorageMapper;
import com.kyle.cloud.alibaba.service.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 小邓
 * @date 2020/10/27 - 10:53
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void deduct(String commodityCode, int count) {
        storageMapper.deduct(commodityCode,count);
    }
}
