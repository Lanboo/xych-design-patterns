package com.xych.factory.method.factory;

import com.xych.factory.method.model.chef.Chef;
import com.xych.factory.method.model.mooncake.MoonCake;

public interface MoonCakeFactory {
    MoonCake create();

    MoonCake create(Chef chef);
}
