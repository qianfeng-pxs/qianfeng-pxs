package com.qianfeng.desigin.factory.method;

public class MethodFactoryA implements IMethodFactory{
    @Override
    public IMethodProduct makeProduct() {
        return new MethodProductA();
    }
}
