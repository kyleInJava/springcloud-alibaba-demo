package com.kyle.cloud.alibaba.service.consumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.kyle.cloud.alibaba.service.consumer.handler.BlockHandler;
import com.kyle.cloud.alibaba.service.consumer.handler.FallBack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小邓
 * @date 2020/10/23 - 16:35
 */
@RestController
@RequestMapping("consumer2")
public class ConsumerController2 {


    @GetMapping("a")
    @SentinelResource(value="a",
            fallback = "fallBackMethod",
            blockHandler = "blockHandlerMethod",
            exceptionsToIgnore = NullPointerException.class)
    public String a(@RequestParam(value ="p1",required = false)String p1,
                    @RequestParam(value ="p2",required = false)String p2){
        if("1".equals(p1)){
            throw new RuntimeException("p1 不能为1");
        }
        if("2".equals(p2)){
            throw new NullPointerException("p2 不能为2");
        }

        return "a";
    }


    @GetMapping("b")
    @SentinelResource(value="b",
                    blockHandlerClass = BlockHandler.class,
                    blockHandler = "defaultBlockHandler",
                    fallbackClass = FallBack.class,
                    fallback = "globalFallBackMethod")
    public String b(@RequestParam(value ="p1",required = false)String p1,
                    @RequestParam(value ="p2",required = false)String p2){
        if("1".equals(p1)){
            throw new RuntimeException("p1 不能为1");
        }
        if("2".equals(p2)){
            throw new NullPointerException("p2 不能为2");
        }

        return "a";
    }


    public String blockHandlerMethod(String p1,String p2, BlockException e){
        return "触发熔断降级";
    }

    public String fallBackMethod(String p1,String p2,Throwable e){
        return "触发异常降级";
    }
}
