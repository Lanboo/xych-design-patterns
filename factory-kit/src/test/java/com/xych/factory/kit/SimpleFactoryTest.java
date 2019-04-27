package com.xych.factory.kit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.xych.factory.emun.MoonCakeType;
import com.xych.factory.factory.simple.MoonCakeSimpleFactory;
import com.xych.factory.model.MoonCake;

public class SimpleFactoryTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void test1() {
        MoonCake moonCake = MoonCakeSimpleFactory.create("WuRen");
        System.out.println(moonCake);
    }

    @Test
    public void test2() {
        MoonCake moonCake = MoonCakeSimpleFactory.create(MoonCakeType.RouSong);
        System.out.println(moonCake);
    }

    // @Test(expected = RuntimeException.class)
    @Test
    public void test3() {
        exception.expect(RuntimeException.class);
        exception.expectMessage("not this mooncake");
        MoonCake moonCake = MoonCakeSimpleFactory.create("123");
        System.out.println(moonCake);
    }
}
