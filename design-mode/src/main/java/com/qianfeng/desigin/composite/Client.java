package com.qianfeng.desigin.composite;

public class Client {
    public static void main(String[] args) {
        Component rootMenu = new Composite("root菜单");
        Component firstMenuA = new Composite("一级菜单MenuA");
        Component firstMenuB= new Composite("一级菜单MenuB");
        rootMenu.add(firstMenuA);
        rootMenu.add(firstMenuB);

        Component secondMenuA = new Leaf("二级级菜单MenuA");
        firstMenuA.add(secondMenuA);
        rootMenu.display(1);
        System.out.println("-------------------------------");
        firstMenuA.display(1);
    }
}
