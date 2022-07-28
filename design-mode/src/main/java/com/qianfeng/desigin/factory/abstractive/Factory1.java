package com.qianfeng.desigin.factory.abstractive;

public class Factory1 extends IAbstractFactory {

    @Override
    public ProductA makeProductA() {
        return new ProductA1Impl();
    }

    @Override
    public ProductB makeProductB() {
        return new ProductB1Impl();
    }
}
