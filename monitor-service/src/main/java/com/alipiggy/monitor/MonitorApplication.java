package com.alipiggy.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author：
 * Date：2023/12/1200:00
 * Desc:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class,args);
    }
}
