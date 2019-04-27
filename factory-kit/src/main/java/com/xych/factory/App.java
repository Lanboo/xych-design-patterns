package com.xych.factory;

import com.xych.factory.emun.MoonCakeType;
import com.xych.factory.factory.kit.MoonCakeFactory;
import com.xych.factory.model.MoonCake;
import com.xych.factory.model.RSMoonCake;
import com.xych.factory.model.WRMoonCake;
import com.xych.factory.model.YWMoonCake;

public class App {
    private static MoonCakeFactory factory;
    static {
        factory = MoonCakeFactory.factory(builder -> {
            builder.add(MoonCakeType.RouSong, RSMoonCake::new);
            builder.add(MoonCakeType.WuRen, WRMoonCake::new);
            builder.add(MoonCakeType.YuanWei, YWMoonCake::new);
        });
    }

    public static void main(String[] args) {
        MoonCake moonCake = factory.create(MoonCakeType.RouSong);
        System.out.println(moonCake);
    }
}
