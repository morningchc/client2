package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/17.
 */
@RestController
@RequestMapping("/welcome")
public class Welcome {
    @GetMapping(value = "/test")
    public String test(){
        String msg = "I'm client2 chc";
        return msg;
    }
}
