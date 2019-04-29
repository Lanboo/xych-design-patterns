package com.xych.abstractfactory;

import org.junit.Test;

import com.xych.abstractfactory.factory.BreadMakingFactory;
import com.xych.abstractfactory.factory.LanbooBreadMakingFactory;
import com.xych.abstractfactory.factory.XychBreadMakingFactory;

public class AbstractFactoryTest {
    @Test
    public void test1() {
        BreadMakingFactory factory = new XychBreadMakingFactory();
        Baker baker = new Baker(factory);
        baker.create();
        System.out.println();
    }

    @Test
    public void test2() {
        BreadMakingFactory factory = new LanbooBreadMakingFactory();
        Baker baker = new Baker(factory);
        baker.create();
        System.out.println();
    }
}
