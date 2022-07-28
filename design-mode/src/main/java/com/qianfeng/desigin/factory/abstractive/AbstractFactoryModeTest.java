package com.qianfeng.desigin.factory.abstractive;

public class AbstractFactoryModeTest {
    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        factory1.makeProductA().doSomething();
        factory1.makeProductB().doSomething();

        Factory2 factory2 = new Factory2();
        factory2.makeProductA().doSomething();
        factory2.makeProductB().doSomething();

    }
}
