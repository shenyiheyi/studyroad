package com.cfh.demo.service.impl;

import com.cfh.annotation.MyService;
import com.cfh.demo.service.IDemoService;

@MyService
public class DemoServiceImpl implements IDemoService {
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
