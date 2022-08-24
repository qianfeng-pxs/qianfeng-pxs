package com.qianfeng.desigin.decorator;

public abstract class AbstractCake {

    private int price;

    private String desc;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract int calCost();
}
