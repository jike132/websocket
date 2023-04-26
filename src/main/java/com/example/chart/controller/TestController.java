package com.example.chart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author neucloud
 */
@RestController
@RequestMapping("test")
public class TestController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("/haha")
    public String test(){
        logger.info("测试");
        return "hello";
    }
}
