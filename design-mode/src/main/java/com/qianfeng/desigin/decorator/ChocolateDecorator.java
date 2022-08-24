package com.qianfeng.desigin.decorator;

public class ChocolateDecorator extends Decorator {

    public ChocolateDecorator(AbstractCake cake) {
        super(cake);
        setDesc("巧克力" + cake.getDesc());
        setPrice(6 + cake.getPrice());
    }
}
