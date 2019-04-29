package com.xych.abstractfactory.model.shape;

import lombok.Data;

@Data
public class Shape implements IShape {
    private String desc;

    public Shape() {
        super();
    }

    public Shape(String desc) {
        super();
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Shape = " + desc;
    }
}
