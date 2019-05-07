package com.xych.proxy.cglibproxy;

import java.lang.reflect.Method;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

@Slf4j
public class DaoCglibProxy implements MethodInterceptor {
    private IDao target;
    private Log logger;

    public DaoCglibProxy(IDao target, Log logger) {
        this.target = target;
        this.logger = logger;
    }

    @SuppressWarnings("unchecked")
    public <T extends IDao> T getInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        if(method.getName().startsWith("save")) {
            log.info("CglibProxy:save Start");
            logger.doSaveLog();
            Object result = method.invoke(this.target, args);
            log.info("CglibProxy:save End");
            return result;
        }
        else if(method.getName().startsWith("update")) {
            log.info("CglibProxy:update Start");
            logger.doUpdateLog();
            Object result = method.invoke(this.target, args);
            log.info("CglibProxy:update End");
            return result;
        }
        return method.invoke(this.target, args);
    }
}
