package com.xych.decorator.battercake.v2;

public abstract class Battercake {
    protected abstract String getMsg();

    protected abstract int getPrice();

    @Override
    public String toString() {
        return getMsg() + ",总价格:" + getPrice();
    }
}
