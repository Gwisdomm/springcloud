package com.gao.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: tx_springcloud_02
 * @description:
 * @author: gaowz
 * @create: 2021-01-18 21:21
 **/
@Component
@FeignClient("CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface ConsummerHystrixService {

    @GetMapping(value = "/payment/get/info/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id")Integer id);

    @GetMapping(value = "/payment/get/info/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id")Integer id);
}
