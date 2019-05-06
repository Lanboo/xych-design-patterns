package com.xych.prototype.simple.model;

public class Bean implements Cloneable {
    @SuppressWarnings("unchecked")
    public <T extends Bean> T copy() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}
