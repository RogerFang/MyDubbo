package com.roger.service.impl;

import com.roger.service.DemoService;

/**
 * Created by Roger on 2016/8/3.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "hello: " + name;
    }
}
