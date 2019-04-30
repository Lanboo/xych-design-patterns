package com.xych.singleton.hungry;

/**
 * <pre>
 * 饿汉式单例模式
 * 
 * 优点：写法简单，线程安全
 * 缺点：类加载时就被初始化，不管你使用不使用，都会占用空间
 * </pre>
 * 
 * @Author XYCH
 * @CreateDate 2019年4月30日下午2:28:15
 * @Since: JDK1.8
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
        // 防止利用反射机制破坏单例模式
        if(singleton != null) {
            throw new RuntimeException("already exists");
        }
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
