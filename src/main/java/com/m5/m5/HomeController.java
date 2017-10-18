package com.m5.m5;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value="/hello")
    public String hello() {
        return "hello";
    }
}
