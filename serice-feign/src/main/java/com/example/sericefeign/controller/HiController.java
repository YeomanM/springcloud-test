package com.example.sericefeign.controller;

import com.example.sericefeign.remote.SchedualServiceHi;
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
public class HiController {

    @Autowired
    SchedualServiceHi hi;

    @RequestMapping("hi")
    public String hi(@RequestParam(defaultValue = "xbb") String name) {
        return hi.hi(name);
    }

}
