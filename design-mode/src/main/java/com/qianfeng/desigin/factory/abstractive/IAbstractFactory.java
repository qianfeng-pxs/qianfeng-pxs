package com.qianfeng.desigin.factory.abstractive;

public abstract class IAbstractFactory {
    // 创建A类产品
    abstract IAbstractProductA makeProductA();

    // 创建B类产品
    abstract IAbstractProductB makeProductB();
}
