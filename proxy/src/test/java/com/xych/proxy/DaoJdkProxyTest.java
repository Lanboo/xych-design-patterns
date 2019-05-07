package com.xych.proxy;

import org.junit.Test;

import com.xych.proxy.jdkproxy.ADaoImpl;
import com.xych.proxy.jdkproxy.DaoJdkProxy1;
import com.xych.proxy.jdkproxy.IDao;
import com.xych.proxy.jdkproxy.Log;

public class DaoJdkProxyTest {
    @Test
    public void test1() {
        DaoJdkProxy1 proxy = new DaoJdkProxy1(new ADaoImpl(), new Log());
        IDao dao = proxy.getInstance();
        dao.save();
    }
}
