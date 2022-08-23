package com.qianfeng.desigin.bridge;

public class Banana implements Taste{
    @Override
    public void addFood(String food) {
        System.out.println("香蕉口味" + food);
    }
}
