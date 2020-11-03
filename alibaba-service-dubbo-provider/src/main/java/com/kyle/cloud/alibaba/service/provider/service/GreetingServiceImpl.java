package com.kyle.cloud.alibaba.service.provider.service;

import com.kyle.cloud.alibaba.service.api.GreetingService;
import com.kyle.cloud.alibaba.service.entity.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author 小邓
 * @date 2020/10/29 - 9:13
 */
@Service(version = "1.0.0")//这个注解会将这个对象添加到spring容器中
public class GreetingServiceImpl implements GreetingService {


    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }

    @Override
    public User getUserInfo() {
        User user = new User();
        user.setName("kyle");
        user.setAge(16);
        return user;
    }
}
