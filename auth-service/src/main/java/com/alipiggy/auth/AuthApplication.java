package com.alipiggy.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author：
 * Date：2023/12/1123:40
 * Desc:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AuthApplication {
    public static void main(String[] args){
        SpringApplication.run(AuthApplication.class, args);
    }
}
