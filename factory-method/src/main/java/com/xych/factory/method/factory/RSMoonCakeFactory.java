package com.xych.factory.method.factory;

import com.xych.factory.method.model.chef.Chef;
import com.xych.factory.method.model.mooncake.MoonCake;
import com.xych.factory.method.model.mooncake.RSMoonCake;

public class RSMoonCakeFactory implements MoonCakeFactory {
    @Override
    public MoonCake create() {
        return new RSMoonCake();
    }

    @Override
    public MoonCake create(Chef chef) {
        return new RSMoonCake(chef);
    }
}
