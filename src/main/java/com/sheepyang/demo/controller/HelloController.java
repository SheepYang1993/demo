package com.sheepyang.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {
    @RequestMapping("/hello/{userName}")
    public String sayHello(@PathVariable String userName) {
        return "hello:" + userName + "!!";
    }
}
