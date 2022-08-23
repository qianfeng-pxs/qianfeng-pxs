package com.qianfeng.desigin.bridge;

public class TestBridge {
    public static void main(String[] args) {
        Food food1 = new Cake();
        Banana banana = new Banana();
        food1.setTaste(banana);
        food1.makeFood();

        Food food2 = new Milk();
        food2.setTaste(banana);
        food2.makeFood();
    }
}
