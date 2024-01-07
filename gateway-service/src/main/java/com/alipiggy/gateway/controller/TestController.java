package com.alipiggy.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：
 * Date：2023/12/1823:59
 * Desc:
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String get() {
        System.out.println("nginx 请求过来啦");
        return "nginx 请求过来啦！";
    }
}
