package com.kyle.cloud.alibaba.service.consumer.handler;

/**
 * @author 小邓
 * @date 2020/10/24 - 9:52
 */
public class FallBack {

    public static String globalFallBackMethod(String p1,String p2,Throwable e){
        return "触发异常降级,默认方法";
    }
}
