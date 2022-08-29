package com.qianfeng.desigin.proxy.cglibproxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxy implements MethodInterceptor {

    //准备一个目标对象
    private Object target;

    //通过构造器传入目标对象
    public CglibDynamicProxy(Object target) {
        this.target = target;
    }


    /*
     * 用来获取代理对象(创建一个代理对象)
     * */
    public Object getProxy() {
        //可以通过Enhancer对象中的create()方法可以去生成一个类，用于生成代理对象
        Enhancer enhancer = new Enhancer();
        //设置父类(将目标类作为代理类的父类)
        enhancer.setSuperclass(target.getClass());
        //设置拦截器(回调对象为本身对象)
        enhancer.setCallback(this);
        //生成一个代理类对象并返回给调用着
        return enhancer.create();
    }

    /**
     * 拦截器
     *
     * @param o           cglib 动态生成的代理类的实例
     * @param method      实体类所调用的都被代理的方法的引用
     * @param objects     参数列表
     * @param methodProxy 生成的代理类对方法的代理引用
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object object = new Object();
        //增强行为
        if ("doSomething".equals(method.getName())) {
            System.out.println("准备工具");
            //调用目标类中的方法
            object = methodProxy.invoke(target, objects);
            //增强行为
            System.out.println("干完活收拾工具");
        } else if ("afterDoSomething".equals(method.getName())) {
            object = methodProxy.invoke(target, objects);
            System.out.println("洗澡吃饭睡觉");

        }
        return object;
    }
}
