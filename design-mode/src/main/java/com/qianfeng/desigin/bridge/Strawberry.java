package com.qianfeng.desigin.bridge;

public class Strawberry implements Taste{
    @Override
    public void addFood(String food) {
        System.out.println("草莓口味" + food);
    }
}
