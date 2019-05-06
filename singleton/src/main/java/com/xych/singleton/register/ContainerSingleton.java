package com.xych.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private ContainerSingleton() {
    }

    // Spring中IOC容器就是这种方式
    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        synchronized(ioc) {
            if(!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
            else {
                return ioc.get(className);
            }
        }
    }
}
