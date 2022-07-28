package com.qianfeng.desigin.factory.abstractive;

public class Factory1 extends IAbstractFactory {

    @Override
    public IAbstractProductA makeProductA() {
        return new ProductA1Impl();
    }

    @Override
    public IAbstractProductB makeProductB() {
        return new ProductB1Impl();
    }
}
