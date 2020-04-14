package com.example.sericefeign.remote.impl;

import com.example.sericefeign.remote.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author 冯宇明
 * @version 1.0
 * @date 2020/4/13
 * @desc
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String hi(String name) {
        return "Sorry, " + name;
    }
}
