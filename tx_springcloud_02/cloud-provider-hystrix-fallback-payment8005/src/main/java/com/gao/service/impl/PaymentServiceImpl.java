package com.gao.service.impl;

import com.gao.service.IPaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @program: tx_springcloud_02
 * @description: 支付接口的实现类
 * @author: gaowz
 * @create: 2020-11-26 22:43
 **/
@Service
public class PaymentServiceImpl implements IPaymentService {

    /**
     * 正常访问的方法
     *
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "线程池" + Thread.currentThread().getName() + " paymentInfo_Ok id" + id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")  //3秒钟以内就是正常的业务逻辑
    })
    @Override
    public String paymentInfo_Timeout(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池" + Thread.currentThread().getName() + " paymentInfo_Ok id" + id;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池" + Thread.currentThread().getName() + " paymentInfo_TimeOutHandler方法超时" + id;
    }
}
