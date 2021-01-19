package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: tx_springcloud_02
 * @description: docker测试服务的入口程序
 * @author: gaowz
 * @create: 2020-12-10 13:41
 **/
@SpringBootApplication
public class DockerMain {
    public static void main(String[] args) {
        SpringApplication.run(DockerMain.class);
    }
}
