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
    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}




