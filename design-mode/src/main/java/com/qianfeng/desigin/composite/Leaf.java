package com.qianfeng.desigin.composite;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("叶子节点不支持添加操作");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("叶子节点不支持删除操作");
    }

    @Override
    public void display(int depth) {
        StringBuilder desc = new StringBuilder();
        //输出树形结构
        for (int i = 0; i < depth; i++) {
            desc.append("-");
        }
        desc.append(name);
        System.out.println(desc);
    }
}
