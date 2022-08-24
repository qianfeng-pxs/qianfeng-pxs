package com.qianfeng.desigin.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        AbstractCake cake = new SpecificCake();
         cake = new ChocolateDecorator(cake);
        System.out.println(cake.getDesc() + "的价格是" + cake.getPrice());
    }
}
