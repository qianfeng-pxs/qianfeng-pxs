package com.qianfeng.desigin.proxy.staticproxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        SubjectProxy proxy = new SubjectProxy(subject);
        proxy.doSomething();
    }
}
