package com.kyle.cloud.alibaba.service.consumer.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author 小邓
 * @date 2020/10/24 - 9:48
 */
public class BlockHandler {


    public static String defaultBlockHandler(String p1,String p2, BlockException e){
        return "触发熔断降级,默认方法";
    }
}
