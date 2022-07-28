package com.qianfeng.desigin.factory.abstractive;

public class Factory2 extends IAbstractFactory {

    @Override
    public ProductA makeProductA() {
        return new ProductA2Impl();
    }

    @Override
    public ProductB makeProductB() {
        return new ProductB2Impl();
    }
}
