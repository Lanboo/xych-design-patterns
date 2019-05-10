package com.xych.decorator.battercake.v1;

public class Battercake {
    protected String getMsg() {
        return "煎饼";
    }

    public int getPrice() {
        return 5;
    }

    @Override
    public String toString() {
        return getMsg() + ",总价格:" + getPrice();
    }
}
