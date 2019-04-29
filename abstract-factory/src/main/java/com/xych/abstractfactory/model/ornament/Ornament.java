package com.xych.abstractfactory.model.ornament;

import lombok.Data;

@Data
public class Ornament implements IOrnament {
    protected String name;

    public Ornament(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ornament by " + name;
    }
}
