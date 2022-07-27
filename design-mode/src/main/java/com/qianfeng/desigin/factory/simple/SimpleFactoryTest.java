package com.qianfeng.desigin.factory.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        System.out.println("普通方式调用工厂");
        SimpleFactory.makeProduct("A").doSomeThing();
        SimpleFactory.makeProduct("B").doSomeThing();
        SimpleFactory.makeProduct("C").doSomeThing();

        System.out.println("---------------------");
        System.out.println("反射方式调用工厂");
        SimpleFactory.creatProduct(SimpleProductA.class).doSomeThing();
        SimpleFactory.creatProduct(SimpleProductB.class).doSomeThing();

    }
}
