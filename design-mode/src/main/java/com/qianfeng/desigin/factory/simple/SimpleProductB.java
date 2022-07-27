package com.qianfeng.desigin.factory.simple;

public class SimpleProductB implements ISimpleProduct {
    @Override
    public void doSomeThing() {
        System.out.println("创建了B产品");
    }
}

