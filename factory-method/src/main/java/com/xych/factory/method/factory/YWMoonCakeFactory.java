package com.xych.factory.method.factory;

import com.xych.factory.method.model.chef.Chef;
import com.xych.factory.method.model.mooncake.MoonCake;
import com.xych.factory.method.model.mooncake.YWMoonCake;

public class YWMoonCakeFactory implements MoonCakeFactory {
    @Override
    public MoonCake create() {
        return new YWMoonCake();
    }

    @Override
    public MoonCake create(Chef chef) {
        return new YWMoonCake(chef);
    }
}
