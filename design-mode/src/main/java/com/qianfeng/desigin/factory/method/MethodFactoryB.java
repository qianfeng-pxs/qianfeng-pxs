package com.qianfeng.desigin.factory.method;

public class MethodFactoryB implements IMethodFactory{
    @Override
    public IMethodProduct makeProduct() {
        return new MethodProductB();
    }
}
