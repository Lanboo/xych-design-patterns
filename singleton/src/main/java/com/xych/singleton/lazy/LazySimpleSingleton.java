package com.xych.singleton.lazy;

/**
 * 懒汉式
 * 缺点：使用频率高的情况下，synchronized会极度浪费性能
 * @Author XYCH
 * @CreateDate 2019年4月30日下午2:41:55
 * @Since: JDK1.8
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton() {
        // 防止利用反射机制破坏单例模式
        if(singleton != null) {
            throw new RuntimeException("already exists");
        }
    }

    private static LazySimpleSingleton singleton = null;

    public synchronized static LazySimpleSingleton getInstance() {
        if(singleton == null) {
            return new LazySimpleSingleton();
        }
        return singleton;
    }
}
