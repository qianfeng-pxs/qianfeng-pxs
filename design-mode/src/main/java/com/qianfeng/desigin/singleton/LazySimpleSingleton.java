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


/**
 * 登记式/静态内部类这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 *
 *
 */
class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
        // 优化创建过程，防止使用反射来调用其构造方法，再调用getInstance()方法，创建两个不同的实例
        if(LazyHolder.INSTANCE != null){
            throw new RuntimeException("不允许非法访问");
        }
    }
    // 只有通过显式调用 getInstance 方法时，才会显式装载 LazyStaticInnerClassSingleton 类
    private static final LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}





