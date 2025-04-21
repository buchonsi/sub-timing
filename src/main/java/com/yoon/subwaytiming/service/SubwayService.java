package com.yoon.subwaytiming.service;

import org.springframework.stereotype.Service;

@Service
public class SubwayService {
    public void test3() {
        System.out.println("test3");
    }
    public void service() {

        int a = 100;
        int b = 200;
        int result = a + b;

        System.out.println(result);


    }
    public void test5() {
        System.out.println("master_test1");
    }

    public void test6_master_test() {
        System.out.println("master_test2");
    }
}
