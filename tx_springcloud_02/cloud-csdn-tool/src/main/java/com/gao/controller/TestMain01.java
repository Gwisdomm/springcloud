package com.gao.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.commons.lang.StringEscapeUtils;

import java.util.ArrayList;

/**
 * @program: tx_springcloud_02
 * @description: 测试内部类
 * @author: gaowz
 * @create: 2020-12-10 11:13
 **/
public class TestMain01 {
    public static void main(String[] args) {
        /*TestInnorMethod testInnorMethod = new TestInnorMethod.Build().age(2).build();
        System.out.println(testInnorMethod.getAge());*/
        ArrayList<Integer> list = new ArrayList<Integer>(15);
        for (int i = 0 ;i < 17;i++){
            list.add(i);
        }
        System.out.println(list.size());
        System.out.println(StringEscapeUtils.unescapeHtml("烟灶直播&ldquo;圣诞奇妙夜&rdquo;活动通知"));

    }


}
