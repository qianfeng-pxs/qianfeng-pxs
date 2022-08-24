package com.qianfeng.desigin.decorator;

public class SpecificCake extends AbstractCake{

    public SpecificCake() {
        setDesc("蛋糕");
        setPrice(5);
    }

    @Override
    public int calCost() {
        return super.getPrice();
    }
}
