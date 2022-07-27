package com.qianfeng.desigin.factory.simple;

public class SimpleProductA implements ISimpleProduct {
    @Override
    public void doSomeThing() {
        System.out.println("创建了A产品");
    }
}
