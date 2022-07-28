package com.qianfeng.desigin.factory.method;

public  class MethodFactoryTest {
    public static void main(String[] args) {
        new MethodFactoryA().makeProduct().doSomething();
        new MethodFactoryB().makeProduct().doSomething();
    }
}
