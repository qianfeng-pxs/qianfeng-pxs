package com.qianfeng.desigin.proxy.jdkproxy;

import java.lang.reflect.Proxy;

public class JDKProxyTest {
    public static void main(String[] args) {
        JDKSubject subject = new JDKSubject();
        JDKDynamicProxy proxy = new JDKDynamicProxy(subject);
        IJDKSubject jdkSubject = (IJDKSubject) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]{IJDKSubject.class}, proxy);
        jdkSubject.doSomething();
        jdkSubject.afterDoSomething();
    }
}
