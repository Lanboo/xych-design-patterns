package com.xych.factory.factory.kit;

import java.util.HashMap;
import java.util.Map;

import com.xych.factory.emun.MoonCakeType;
import com.xych.factory.model.MoonCake;
import com.xych.factory.model.RSMoonCake;
import com.xych.factory.model.WRMoonCake;
import com.xych.factory.model.YWMoonCake;

public class MoonCakeKitFactory {
    private static Map<MoonCakeType, Class<? extends MoonCake>> map = new HashMap<>();
    static {
        map.put(MoonCakeType.RouSong, RSMoonCake.class);
        map.put(MoonCakeType.WuRen, WRMoonCake.class);
        map.put(MoonCakeType.YuanWei, YWMoonCake.class);
    }

    MoonCake create(MoonCakeType name) throws Exception {
        Class<? extends MoonCake> clazz = map.get(name);
        if(clazz == null) {
            return null;
        }
        return clazz.newInstance();
    }
}
