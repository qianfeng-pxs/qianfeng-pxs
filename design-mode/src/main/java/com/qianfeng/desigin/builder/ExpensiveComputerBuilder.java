package com.qianfeng.desigin.builder;

public class ExpensiveComputerBuilder implements ComputerBuilder {


    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("昂贵的CPU");
        System.out.println("安装了昂贵的CPU");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("昂贵的内存");
        System.out.println("安装了昂贵的内存");
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("昂贵的主板");
        System.out.println("安装了昂贵的主板");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("昂贵的硬盘");
        System.out.println("安装了昂贵的硬盘");

    }

    @Override
    public void buildPower() {
        computer.setPower("昂贵的电源");
        System.out.println("安装了昂贵的电源");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
