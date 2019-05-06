[toc]

# 单例模式（Singleton Pattern）
> 单例模式是指确保一个类在任何情况下都绝对只有一个实例，并提供一个全局访问点。

## 1、饿汉式
> 写法简单，没有线程安全问题。<br>
> 缺点：类加载时就被初始化，不管你使用不使用，都会占用空间。
``` java
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
```

``` java
public class HungryStaticSingleton {
    private static HungryStaticSingleton singleton;
    static {
        singleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
        // 防止利用反射机制破坏单例模式
        if(singleton != null) {
            throw new RuntimeException("already exists");
        }
    }

    public static HungryStaticSingleton getInstance() {
        return singleton;
    }
}
```
## 2、懒汉式
### 2.1、简单模式
> 不添加`synchronized`关键字，会有线程安全问题。<br>
> 添加`synchronized`关键字，有效率问题。

``` java
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
```

### 2.2、双重检查锁
``` java
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
```

### 2.3、静态内部类模式
> 线程安全、懒加载。（类，只有在使用的时候才会被加载）
``` java
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
```

## 3、枚举方式实现单例
``` java
public enum EnumSingleton {
    INSTANCE;
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
```

## 4、ConcurrentHashMap实现单例
``` java
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
```

## 5、ThreadLocal实现线程中单例
``` java
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
```

## 6、防止反射
> 构造方法中抛异常即可。<br>
> <b>枚举不能被反射。故枚举实现单例模式，不用处理该逻辑</b>

## 7、防止反序列化
> 利用反序列化的原理增加`private  Object readResolve()`方法即可。<br>
> <b>枚举方式实现单例，不同处理这个步骤。</b>
``` java
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

    private Object readResolve(){
        return LazyHolder.LAZY;
    }
}
```

