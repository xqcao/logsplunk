package com.example.splunkdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private static final Logger LOG =  LoggerFactory.getLogger("testhttp");
    @RequestMapping("/ping")
    public String ping(){
        LOG.info("hello");
        return "pong";
    }
    
}
