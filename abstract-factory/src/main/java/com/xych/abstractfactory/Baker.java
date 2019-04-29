package com.xych.abstractfactory;

import com.xych.abstractfactory.factory.BreadMakingFactory;

public class Baker {
    private BreadMakingFactory factory;

    public Baker(BreadMakingFactory factory) {
        super();
        this.factory = factory;
    }

    public void create() {
        System.out.println(factory.createDough());
        System.out.println(factory.createSeasoning());
        System.out.println(factory.createShape());
        System.out.println(factory.createOrnament());
        System.out.println(factory.toast());
    }
}
