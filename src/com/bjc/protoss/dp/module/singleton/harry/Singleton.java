package com.bjc.protoss.dp.module.singleton.harry;

/**
 * Created by zhexzhi on 12/14/2016.
 */
public class Singleton  {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    /* 静态工程方法，创建实例 */
    public static Singleton getInstance2() {
        if (instance == null) {
            instance = new Singleton();
            System.out.print("getInstance2");
        }
        return instance;
    }

    /* 加synchronized关键字,提供线程安全保护 Thread Safe Lazy Loaded */
    public static synchronized Singleton getInstance1() {
        if (instance == null) {
            instance = new Singleton();
            System.out.print("getInstance1 加synchronized关键字,提供线程安全保护");
        }
        return instance;
    }

    /*只有在第一次创建对象的时候需要加锁，之后就不需要*/
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                    System.out.print("getInstance 只有在第一次创建对象的时候需要加锁，之后就不需要");
                }
            }
        }
        return instance;
    }


    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
