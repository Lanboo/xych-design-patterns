package com.xych.factory.method;

import org.junit.Test;

import com.xych.factory.method.factory.MoonCakeFactory;
import com.xych.factory.method.factory.RSMoonCakeFactory;
import com.xych.factory.method.factory.WRMoonCakeFactory;
import com.xych.factory.method.factory.YWMoonCakeFactory;
import com.xych.factory.method.model.chef.LiChef;
import com.xych.factory.method.model.chef.WangChef;
import com.xych.factory.method.model.mooncake.MoonCake;

public class FactoryMethodTest {
    @Test
    public void test1() {
        MoonCakeFactory factory = new RSMoonCakeFactory();
        create(factory);
    }

    @Test
    public void test2() {
        MoonCakeFactory factory = new WRMoonCakeFactory();
        create(factory);
    }

    @Test
    public void test3() {
        MoonCakeFactory factory = new YWMoonCakeFactory();
        create(factory);
    }

    private void create(MoonCakeFactory factory) {
        MoonCake moonCake = factory.create();
        System.out.println(moonCake);
        moonCake = factory.create(new LiChef());
        System.out.println(moonCake);
        moonCake = factory.create(new WangChef());
        System.out.println(moonCake);
    }
}
