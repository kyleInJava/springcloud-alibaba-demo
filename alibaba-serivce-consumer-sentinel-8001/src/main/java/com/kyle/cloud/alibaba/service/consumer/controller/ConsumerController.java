package com.kyle.cloud.alibaba.service.consumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 小邓
 * @date 2020/10/21 - 11:26
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    private static final String PROVIDER_URL = "http://service-provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("info")
    public String getInfo(){
        return restTemplate.getForObject(PROVIDER_URL+"/provider/info",String.class);
    }

    @GetMapping("a")
    public String a(){
        return restTemplate.getForObject(PROVIDER_URL+"/provider/a",String.class);
    }

    @GetMapping("b")
    public String b(){
        return restTemplate.getForObject(PROVIDER_URL+"/provider/a",String.class);
    }

    @GetMapping("c")
    public String c(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "c";
    }

    @GetMapping("d")
    @SentinelResource(value = "consumer-d",blockHandler = "blockHandlerMethod")
    public String d(@RequestParam(value ="p1",required = false)String p1,
                    @RequestParam(value ="p2",required = false)String p2){
        return "d";
    }

    public String blockHandlerMethod(String p1, String p2, BlockException e){
        return "blockHandlerMethod";
    }
}
