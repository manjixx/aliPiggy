package com.alipiggy.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author：
 * Date：2023/12/1200:11
 * Desc:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TurbineStreamServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineStreamServiceApplication.class, args);
    }
}
