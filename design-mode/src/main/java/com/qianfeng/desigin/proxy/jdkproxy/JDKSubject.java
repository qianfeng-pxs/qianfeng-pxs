package com.qianfeng.desigin.proxy.jdkproxy;

public class JDKSubject implements IJDKSubject {
    @Override
    public void doSomething() {
        System.out.println("干活");
    }

    @Override
    public void afterDoSomething() {
        System.out.println("回家");
    }
}
