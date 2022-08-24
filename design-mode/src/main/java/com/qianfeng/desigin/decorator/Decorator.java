package com.qianfeng.desigin.decorator;

public class Decorator extends AbstractCake{
    private AbstractCake cake;
    public Decorator(AbstractCake cake){
        this.cake = cake;
    }
    @Override
    public int calCost() {
        return super.getPrice() + cake.getPrice();
    }
}
