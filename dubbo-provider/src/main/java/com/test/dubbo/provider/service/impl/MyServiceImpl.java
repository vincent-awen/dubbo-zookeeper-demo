package com.test.dubbo.provider.service.impl;

import com.test.dubbo.service.MyDemoService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${my.demo.service.version}")
public class MyServiceImpl implements MyDemoService {

    @Override
    public String sayWelcome(String name) {
        return "Hello " + name + ", you are welcome!";
    }
}