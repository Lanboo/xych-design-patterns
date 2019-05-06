package com.xych.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton() {
        // 防止利用反射机制破坏单例模式
        if(singleton != null) {
            throw new RuntimeException("already exists");
        }
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if(singleton == null) {
            synchronized(LazyDoubleCheckSingleton.class) {
                if(singleton == null) {
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
