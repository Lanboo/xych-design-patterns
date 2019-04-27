package com.xych.factory.factory.kit;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.xych.factory.emun.MoonCakeType;
import com.xych.factory.model.MoonCake;

public interface MoonCakeFactory {
    MoonCake create(MoonCakeType name);

    static MoonCakeFactory factory(Consumer<Builder> consumer) {
        Map<MoonCakeType, Supplier<MoonCake>> map = new HashMap<>();
        consumer.accept(map::put);
        return name -> map.get(name).get();
    }
}
