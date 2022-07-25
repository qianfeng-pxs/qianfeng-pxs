package com.qianfeng.desigin.singleton;

// 为了解决饿汉式单例可能带来的内存浪费问题，于是就出现了懒汉式单例的写法，懒汉式单例模式的特点是，单例对象要在被使用时才会初始化，

/**
 * 懒汉式单例模式的简单实现
 * 优点：节省了内存
 * 缺点：线程不安全
 */
public class LazySimpleSingleton {
    // 单例对象
    private static LazySimpleSingleton instance;

    private LazySimpleSingleton() {
    }

    public static LazySimpleSingleton getInstance() {
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}

/**
 * 懒汉式单例模式通过加锁解决线程安全问题
 * 优点：节省了内存，线程安全
 * 缺点：线程数量比较多的情况下，如果CPU分配压力上升，则会导致大批线程阻塞，从而导致程序性能大幅下降。
 */
class LazySynchronizedSingleton {
    private static LazySynchronizedSingleton instance;

    private LazySynchronizedSingleton() {
    }

    public static LazySynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new LazySynchronizedSingleton();
        }
        return instance;
    }
}

/**
 * 懒汉式单例模式通过检查两次解决线程安全问题
 * 优点:性能高了，线程安全了
 * 缺点：可读性难度加大，不够优雅
 */
 class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance;
    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        //检查是否要阻塞
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //检查是否要重新创建实例
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                    //指令重排序的问题
                }
            }
        }
        return instance;
    }
}





