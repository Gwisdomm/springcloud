package com.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: tx_springcloud_02
 * @description: hystrix的主启动类
 * @author: gaowz
 * @create: 2020-11-26 22:42
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain8003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8003.class,args);
    }
}
