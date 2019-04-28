package com.xych.factory.method.model.mooncake;

import com.xych.factory.method.model.chef.Chef;

public class RSMoonCake extends AbstractMoonCake {
    public RSMoonCake() {
        super();
    }

    public RSMoonCake(Chef chef) {
        super(chef);
    }

    @Override
    public String toString() {
        String str = "RouSong MoonCake";
        if(chef != null) {
            str += " by " + chef;
        }
        return str;
    }
}
