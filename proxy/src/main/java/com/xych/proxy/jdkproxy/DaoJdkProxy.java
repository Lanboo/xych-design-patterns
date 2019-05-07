package com.xych.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DaoJdkProxy implements InvocationHandler {
    private IDao dao;
    private Log logger;

    public DaoJdkProxy(IDao dao, Log logger) {
        this.dao = dao;
        this.logger = logger;
    }

    public IDao getInstance() {
        Class<? extends IDao> clazz = this.dao.getClass();
        return (IDao) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("save")) {
            log.info("DaoJdkProxy:save Start");
            logger.doSaveLog();
            Object obj = method.invoke(this.dao, args);
            log.info("DaoJdkProxy:save End");
            return obj;
        }
        else if(method.getName().startsWith("update")) {
            log.info("DaoJdkProxy:update Start");
            logger.doUpdateLog();
            Object obj = method.invoke(this.dao, args);
            log.info("DaoJdkProxy:update End");
            return obj;
        }
        return method.invoke(this.dao, args);
    }
}
