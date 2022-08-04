package com.qianfeng.desigin.builder;

public class CheapComputer implements ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("便宜的CPU");
        System.out.println("安装了便宜的CPU");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("便宜的内存");
        System.out.println("安装了便宜的内存");
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("便宜的主板");
        System.out.println("安装了便宜的主板");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("便宜的硬盘");
        System.out.println("安装了便宜的硬盘");

    }

    @Override
    public void buildPower() {
        computer.setPower("便宜的电源");
        System.out.println("安装了便宜的电源");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
