package com.qianfeng.desigin.factory.method;

public class MethodProductA implements IMethodProduct{
    @Override
    public void doSomething() {
        System.out.println("创建了产品A");
    }
}
