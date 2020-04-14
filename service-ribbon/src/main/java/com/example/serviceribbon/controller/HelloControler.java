package com.example.serviceribbon.controller;

import com.example.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 冯宇明
 * @version 1.0
 * @date 2020/4/13
 * @desc
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService service;

    @RequestMapping
    public String sayHi(@RequestParam(defaultValue = "小冰冰") String name) {
        return service.sayHi(name);
    }
}
