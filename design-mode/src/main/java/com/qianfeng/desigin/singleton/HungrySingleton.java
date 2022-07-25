package com.qianfeng.desigin.singleton;

// 饿汉式单例模式：饿汉式单例模式在类加载的时候就立即初始化，并且创建单例对象。它绝对线程安全，
// 在线程还没出现以前就实例化了，不可能存在访问安全问题。
// 共有两种方式创建饿汉式单例模式 1.在类加载的时候创建单例对象 2.利用静态代码块创建单例对象

/**
 * 类加载的时候创建单例对象
 * 优点: 执行效率高，线程安全
 * 缺点: 容易造成内存浪费，类没有被使用也会创建该单例对象
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}

/**
 * 利用静态代码块创建单例对象
 */
class HungryStaticSingleton {
    //先静态后动态
    //先上，后下
    //先属性后方法
    private static final HungryStaticSingleton hungrySingleton;

    //装个B
    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
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

