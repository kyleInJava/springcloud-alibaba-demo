package com.kyle.cloud.alibaba.service.serialization;

import com.kyle.cloud.alibaba.service.entity.User;
import org.apache.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 小邓
 * @date 2020/10/29 - 15:00
 */

public class SerializationOptimizerImpl implements SerializationOptimizer {


    @Override
    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        //要让Kryo和FST完全发挥出高性能，最好将那些需要被序列化的类注册到dubbo系统中
        classes.add(User.class);
        return classes;
    }
}
