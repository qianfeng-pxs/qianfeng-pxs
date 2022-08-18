package com.qianfeng.desigin.adapter.objectadapter;

public class ObjectAdapter implements ObjectTarget{

    private ObjectAdaptee objectAdaptee = new ObjectAdaptee();

    @Override
    public void request() {
        // 获取适配前的信息
        objectAdaptee.adapterRequest();
        System.out.println("开始适配");
        // todo 做具体适配操作
        System.out.println("适配完成");
    }
}
