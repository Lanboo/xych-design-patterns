package com.xych.singleton.threadlocal;

/**
 * 每个线程中是单例的。
 * @Author WeiXiaowei
 * @CreateDate 2019年5月6日下午4:20:28
 * @Since: JDK1.8
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        // initialValue 在get时候获取null后使用
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
