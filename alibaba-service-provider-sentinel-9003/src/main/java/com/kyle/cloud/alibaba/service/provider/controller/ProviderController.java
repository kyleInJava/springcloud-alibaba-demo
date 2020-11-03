package com.kyle.cloud.alibaba.service.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小邓
 * @date 2020/10/21 - 10:07
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("info")
    public String getInfo() {
        return port;
    }


    @GetMapping("a")
    public String a() {
        return "a";
    }

    @GetMapping("b")
    public String b() {
        return "b";
    }

    @GetMapping("c")
    public String c() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "c";
    }
}
