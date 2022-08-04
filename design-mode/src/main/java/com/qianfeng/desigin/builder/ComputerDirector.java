package com.qianfeng.desigin.builder;

public class ComputerDirector {

    public Computer create(ComputerBuilder builder) {
        builder.buildCpu();
        builder.buildMemory();
        builder.buildMainBoard();
        builder.buildDisk();
        builder.buildPower();
        return builder.getComputer();
    }
}
