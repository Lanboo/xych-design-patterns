package com.xych.factory.factory.simple;

import com.xych.factory.emun.MoonCakeType;
import com.xych.factory.model.MoonCake;
import com.xych.factory.model.RSMoonCake;
import com.xych.factory.model.WRMoonCake;
import com.xych.factory.model.YWMoonCake;

/**
 * 简单工程模式：根据某个条件，硬编码返回对象
 * @Author XYCH
 * @CreateDate 2019年4月26日下午5:24:31
 * @Since: JDK1.8
 */
public class MoonCakeSimpleFactory {
    public static MoonCake create(String name) {
        switch(name) {
            case "RouSong":
            case "RSMoonCake":
                return new RSMoonCake();
            case "WuRen":
            case "WRMoonCake":
                return new WRMoonCake();
            case "YuanWei":
            case "YWMoonCake":
                return new YWMoonCake();
            default:
                throw new RuntimeException("not this mooncake");
        }
    }

    public static MoonCake create(MoonCakeType name) {
        switch(name) {
            case RouSong:
                return new RSMoonCake();
            case WuRen:
                return new WRMoonCake();
            case YuanWei:
                return new YWMoonCake();
            default:
                throw new RuntimeException("not this mooncake");
        }
    }
}
