package com.example.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 冯宇明
 * @version 1.0
 * @date 2020/4/13
 * @desc
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate template;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String name) {
        return template.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "Sorry, " + name;
    }

}
