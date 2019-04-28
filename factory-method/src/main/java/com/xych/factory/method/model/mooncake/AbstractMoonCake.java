package com.xych.factory.method.model.mooncake;

import com.xych.factory.method.model.chef.Chef;

import lombok.Data;

@Data
public class AbstractMoonCake implements MoonCake {
    protected Chef chef;

    protected AbstractMoonCake() {
    }

    protected AbstractMoonCake(Chef chef) {
        this.chef = chef;
    }
}
