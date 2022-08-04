package com.qianfeng.desigin.builder;

public interface ComputerBuilder {
    void buildCpu();

    void buildMemory();

    void buildMainBoard();

    void buildDisk();

    void buildPower();

    Computer getComputer();
}
