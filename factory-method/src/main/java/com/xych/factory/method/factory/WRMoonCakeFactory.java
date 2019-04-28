package com.xych.factory.method.factory;

import com.xych.factory.method.model.chef.Chef;
import com.xych.factory.method.model.mooncake.MoonCake;
import com.xych.factory.method.model.mooncake.WRMoonCake;

public class WRMoonCakeFactory implements MoonCakeFactory {
    @Override
    public MoonCake create() {
        return new WRMoonCake();
    }

    @Override
    public MoonCake create(Chef chef) {
        return new WRMoonCake(chef);
    }
}
