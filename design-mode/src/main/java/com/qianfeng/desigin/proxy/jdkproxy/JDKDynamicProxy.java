package com.qianfeng.desigin.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKDynamicProxy implements InvocationHandler {

    private Object bean;

    public JDKDynamicProxy(Object bean) {
        this.bean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object object = new Object();
        if ("doSomething".equals(methodName)) {
            System.out.println("准备工具");
            object = method.invoke(bean, args);
            System.out.println("干完活收拾工具");
        } else if ("afterDoSomething".equals(methodName)) {
            object = method.invoke(bean, args);
            System.out.println("洗澡吃饭睡觉");
        }
        return object;
    }
}
