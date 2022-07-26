package com.qianfeng.desigin.singleton;

import java.io.*;

/**
 * 序列化
 * 把内存中对象的状态转换为字节码的形式
 * 把字节码通过IO输出流，写到磁盘上
 * 永久保存下来，持久化
 * <p>
 * 反序列化
 * 将持久化的字节码内容，通过IO输入流读到内存中来
 * 转化成一个Java对象
 */
public class SerializableSingleton implements Serializable {


    public final static SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {
    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }


    /**
     * 解决反序列化获得两个不同的单例对象
     * 原理：
     * ObjectInputStream的readOrdinaryObject()在判断无参构造方法之后，又调用了 hasReadResolveMethod()这个方法,
     * 判断readResolveMethod 是否为空，不为空就返回true。如果为真则调用invokeReadResolve(),在
     * invokeReadResolve()方法中用反射调用了readResolveMethod方法。最终调用readResolve()方法
     * 从上面流程中可以知道虽然增加readResolve()方法返回实例解决了单例模式被破坏的问题，
     * 但是实际上实例化了两次，只不过新创建的对象没有被返回而已。如果创建对象的动作发生频率加快，。
     *
     * @see ObjectInputStream  readOrdinaryObject(), hasReadResolveMethod()
     * ObjectStreamClass()中给readResolveMethod进行了赋值。
     * @see ObjectStreamClass 510行 getInheritableMethod()
     */
    private Object readResolve() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        SerializableSingleton s1 = null;
        // 序列化之前的对象
        SerializableSingleton s2 = SerializableSingleton.getInstance();
        FileOutputStream fos = null;
        try {

            //序列化对象
            fos = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            //反序列化对象
            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializableSingleton) ois.readObject();
            ois.close();

            // 比较两个实例，发现连个实例并不相等
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}



