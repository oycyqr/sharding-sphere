package com.oyc.shardingsphere.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TestController
 * @Author oyc
 * @Date 2020/11/05 16:56
 * @Version
 */
@RestController
@RequestMapping("test")
public class TestController {

    /**
     * @param
     * @return
     * @throws
     * @Description: test
     */
    @GetMapping
    public Object test() {
        return "test";
    }
}
