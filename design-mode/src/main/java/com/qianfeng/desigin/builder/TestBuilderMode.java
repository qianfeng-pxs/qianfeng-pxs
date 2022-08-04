package com.qianfeng.desigin.builder;

public class TestBuilderMode {

    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        System.out.println("开始组装昂贵的电脑");
        Computer expensiveComputer = computerDirector.create(new ExpensiveComputerBuilder());
        System.out.println("昂贵的电脑 = " + expensiveComputer);
        System.out.println("----------------------");
        System.out.println("开始组装便宜的电脑");
        Computer cheapComputer = computerDirector.create(new CheapComputer());
        System.out.println("便宜的电脑 = " + cheapComputer);


    }
}
