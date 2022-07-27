package com.qianfeng.desigin.factory.method;

public class MethodProductB implements IMethodProduct{
    @Override
    public void doSomething() {
        System.out.println("创建了产品B");
    }
}
