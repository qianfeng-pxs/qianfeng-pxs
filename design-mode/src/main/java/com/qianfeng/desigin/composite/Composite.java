package com.qianfeng.desigin.composite;

import java.util.ArrayList;

public class Composite extends Component {

    public Composite(String name) {
        super(name);
    }

    //构建容器,将根节点聚合进来
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();

    @Override
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentArrayList.remove(component);
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
        //下级遍历
        for (Component component : componentArrayList) {
            component.display(depth + 1);
        }
    }
}
