package com.gao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: tx_springcloud_02
 * @description: 测试controller
 * @author: gaowz
 * @create: 2020-12-10 13:39
 **/
@RestController
public class HelloController {

    @RequestMapping(value = "/user/getWord")
    public String getWorld(){
        return "hello world";
    }

}
