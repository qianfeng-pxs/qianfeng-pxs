package com.qianfeng.desigin.proxy.cglibproxy;

public class CglibSubject {
    public void doSomething() {
        System.out.println("干活");
    }

    public void afterDoSomething() {
        System.out.println("回家");
    }
}
