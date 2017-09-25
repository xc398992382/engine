package com.example.engine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:  HelloController
 * Description:Hello测试类
 * Author:  XC
 * Version: 1.0
 * Date : 2017-09-23  19:01
 */
@RestController
public class HelloController {

    /** logger */
     private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value="/hello")
    public String hello(){
        logger.info("log info 测试～～");
        logger.error("log error 测试～～");
        return "Hello SpringBoot01";
    }
}
