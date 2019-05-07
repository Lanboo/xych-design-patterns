package com.xych.proxy;

import org.junit.Test;

import com.xych.proxy.staticproxy.Dao;
import com.xych.proxy.staticproxy.DaoStaticProxy;
import com.xych.proxy.staticproxy.Log;

public class DaoStaticProxyTest {
    @Test
    public void test1() {
        DaoStaticProxy proxy = new DaoStaticProxy(new Dao(), new Log());
        proxy.save();
    }
}
