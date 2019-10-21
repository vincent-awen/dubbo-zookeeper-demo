package com.test.dubbo.consumer.controller;

import com.test.dubbo.service.MyDemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference(version = "${my.demo.service.version}")
    private MyDemoService myService;

    @GetMapping("/welcome/{name}")
    public String sayWelcome(@PathVariable("name") String name) {
        return myService.sayWelcome(name);
    }
}
