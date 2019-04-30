package com.xych.singleton.lazy;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
        if(LazyHolder.LAZY != null) {
            throw new RuntimeException("already exists");
        }
    }

    public static LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
