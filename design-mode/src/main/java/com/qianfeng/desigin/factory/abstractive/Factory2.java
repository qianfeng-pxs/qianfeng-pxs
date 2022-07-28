package com.qianfeng.desigin.factory.abstractive;

public class Factory2 extends IAbstractFactory {

    @Override
    public IAbstractProductA makeProductA() {
        return new ProductA2Impl();
    }

    @Override
    public IAbstractProductB makeProductB() {
        return new ProductB2Impl();
    }
}
