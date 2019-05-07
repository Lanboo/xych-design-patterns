package com.xych.proxy;

import org.junit.Test;

import com.xych.proxy.cglibproxy.ADaoImpl;
import com.xych.proxy.cglibproxy.DaoCglibProxy;
import com.xych.proxy.cglibproxy.IDao;
import com.xych.proxy.cglibproxy.Log;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DaoCglibProxyTest {
    @Test
    public void test1() {
        DaoCglibProxy proxy = new DaoCglibProxy(new ADaoImpl(), new Log());
        IDao dao = proxy.getInstance();
        log.info("{}", dao);
        dao.save();
    }
}
