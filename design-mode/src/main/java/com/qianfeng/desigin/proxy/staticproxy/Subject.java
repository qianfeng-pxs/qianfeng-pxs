package com.qianfeng.desigin.proxy.staticproxy;

public class Subject implements ISubject{
    @Override
    public void doSomething() {
        System.out.println("干活");
    }
}
