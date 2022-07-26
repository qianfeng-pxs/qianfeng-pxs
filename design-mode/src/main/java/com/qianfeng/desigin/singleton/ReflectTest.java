package com.qianfeng.desigin.singleton;

import java.lang.reflect.Constructor;

/**
 * 单例模式的构造方法除了加上private关键字，没有做任何处理。如果我们使用反射来调用其构造方法，再调用getInstance()方法，应该有两个不同的实例
 */
public class ReflectTest {

    public static void main(String[] args) {
        try {
            //在很无聊的情况下进行破坏
            Class<?> clazz = LazyStaticInnerClassSingleton.class;
            //通过反射获取私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //授权强制访问
            c.setAccessible(true);
            //实例化
            Object instance1 = c.newInstance();
            //再次实例化
            Object instance2 = c.newInstance();

            System.out.println(instance1);

            System.out.println(instance2);

            System.out.println(instance1 == instance2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

