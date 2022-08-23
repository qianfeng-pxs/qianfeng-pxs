package com.qianfeng.desigin.bridge;

public abstract class Food {
    // 口味
    Taste taste;
    // 设置食品口味
    void setTaste(Taste taste){
        this.taste =taste;
    }

    abstract void makeFood();
}
