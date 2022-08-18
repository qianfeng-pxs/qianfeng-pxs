package com.qianfeng.desigin.adapter.classadapter;

public class ClassAdapter extends ClassAdaptee implements ClassTarget {

    @Override
    public void request() {
        // 获取适配前的信息
        adapterRequest();
        System.out.println("开始适配");
        // todo 做具体适配操作
        System.out.println("适配完成");
    }
}
