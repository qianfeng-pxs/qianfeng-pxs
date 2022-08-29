package com.qianfeng.desigin.proxy.staticproxy;

public class SubjectProxy implements ISubject {
    private ISubject iSubject;

    public SubjectProxy(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void doSomething() {
        System.out.println("准备工具");
        iSubject.doSomething();
        System.out.println("干完活收拾工具");
    }
}
