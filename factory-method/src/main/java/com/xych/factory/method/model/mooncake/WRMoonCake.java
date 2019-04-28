package com.xych.factory.method.model.mooncake;

import com.xych.factory.method.model.chef.Chef;

/**
 * 五仁月饼
 * @Author XYCH
 * @CreateDate 2019年4月26日下午3:12:33
 * @Since: JDK1.8
 */
public class WRMoonCake extends AbstractMoonCake {
    public WRMoonCake() {
        super();
    }

    public WRMoonCake(Chef chef) {
        super(chef);
    }

    @Override
    public String toString() {
        String str = "WuRen MoonCake";
        if(chef != null) {
            str += " by " + chef;
        }
        return str;
    }
}
