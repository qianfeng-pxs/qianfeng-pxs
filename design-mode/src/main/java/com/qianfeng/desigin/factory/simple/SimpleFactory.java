package com.qianfeng.desigin.factory.simple;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    public SimpleFactory() {
    }

    /**
     * 此处使用if-else,假如新增Product,还需要对工厂进行修改，
     * 违反了开闭原则，不推荐使用，应该采用反射方式,如方法creatProduct
     */
    public static ISimpleProduct makeProduct(String type) {
        if ("A".equals(type)) {
            return new SimpleProductA();
        } else if ("B".equals(type)) {
            return new SimpleProductB();
        } else if ("C".equals(type)) {
            return new SimpleProductC();
        }
        return null;
    }

    /**
     * 采用反射方式，创建对应的Product,这样就不用对工厂再进行修
     */
    public static ISimpleProduct creatProduct(Class<? extends ISimpleProduct> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
