package com.kyle.cloud.alibaba.service.storage.controller;

import com.kyle.cloud.alibaba.service.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小邓
 * @date 2020/10/27 - 10:51
 */
@RestController
@RequestMapping("storage")
public class StorageController {

    @Autowired
    private StorageService storageService;


    @GetMapping("deduct")
    private String deduct(String commodityCode, int count){
        storageService.deduct(commodityCode,count);
        return "库存扣减成功";
    }


}
