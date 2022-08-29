package com.qianfeng.desigin.proxy.cglibproxy;

public class CglibProxyTest {
    public static void main(String[] args) {
        CglibSubject subject = new CglibSubject();
        CglibDynamicProxy proxy = new CglibDynamicProxy(subject);
        CglibSubject subjectProxy = (CglibSubject) proxy.getProxy();

        subjectProxy.doSomething();
        subjectProxy.afterDoSomething();
    }
}
