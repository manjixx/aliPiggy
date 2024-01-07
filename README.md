# PiggyMetric-Alibaba Cloud

## 项目概述

本项目是基于 [piggyMetris](https://github.com/sqshq/piggymetrics)利用alibaba cloud 版本的实现

### 技术选型


| 技术栈   | 原项目技术选型  | 本项目技术选型  |
|---|---|---|
|API网关|Spring Cloud Zuul| Spring Cloud Gateway|
|负载均衡|Eurake+Ribbon | Ribbon |
|远程调用|Feign|Open Feign|
|限流熔断|Hystrix| Sentinel |
|服务注册与发现|Spring Cloud Eurake|Nacos|
|授权认证|Spring Cloud OAuth2| Spring Cloud OAuth2 |
|配置中心|Spring Cloud Config&&Apollo| Nacos |
|分布式调用链监控|Spring Cloud Sleuth| SkyWalking|
|链路追踪|Zipkin|SkyWalking|
|消息队列|RabbitMQ|RocketMQ|
|日志监控|ELK|ELK |

