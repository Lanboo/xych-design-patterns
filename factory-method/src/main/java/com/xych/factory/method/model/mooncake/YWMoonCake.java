package com.xych.factory.method.model.mooncake;

import com.xych.factory.method.model.chef.Chef;

/**
 * 原味月饼
 * @Author XYCH
 * @CreateDate 2019年4月26日下午3:14:24
 * @Since: JDK1.8
 */
public class YWMoonCake extends AbstractMoonCake {
    public YWMoonCake() {
        super();
    }

    public YWMoonCake(Chef chef) {
        super(chef);
    }

    @Override
    public String toString() {
        String str = "YuanWei MoonCake";
        if(chef != null) {
            str += " by " + chef;
        }
        return str;
    }
}
