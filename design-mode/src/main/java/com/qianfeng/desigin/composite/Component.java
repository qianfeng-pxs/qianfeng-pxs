package com.qianfeng.desigin.composite;

public abstract class Component {

    protected String name;


    public Component(String name) {
        this.name = name;
    }

    public void add(Component component) {
        throw new UnsupportedOperationException("抽象根节点不支持添加操作");
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException("抽象根节点不支持添加操作");
    }

    /**
     * 获取分支下的所有叶子构件和树枝构件
     *
     * @param depth 目录结果前打印的”-“数量
     */
    public abstract void display(int depth);
}
