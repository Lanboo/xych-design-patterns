package com.xych.factory.factory.kit;

import java.util.function.Supplier;

import com.xych.factory.emun.MoonCakeType;
import com.xych.factory.model.MoonCake;

public interface Builder {
    void add(MoonCakeType name, Supplier<MoonCake> supplier);
}
