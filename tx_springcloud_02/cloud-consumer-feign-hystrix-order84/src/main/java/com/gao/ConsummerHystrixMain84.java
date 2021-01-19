package com.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: tx_springcloud_02
 * @description:
 * @author: gaowz
 * @create: 2021-01-18 21:25
 **/
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class ConsummerHystrixMain84 {

    public static void main(String[] args) {
        SpringApplication.run(ConsummerHystrixMain84.class,args);
    }

}
