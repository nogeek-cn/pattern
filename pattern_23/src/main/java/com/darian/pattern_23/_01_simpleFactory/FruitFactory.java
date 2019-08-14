package com.darian.pattern_23._01_simpleFactory;


/***
 * 采集工厂
 */
public class FruitFactory {

    public static Fruit getApple() {
        return new Apple();
    }

    public static Fruit getBanana() {
        return new Banana();
    }

    public static Fruit get(String type) {
        if ("apple".equalsIgnoreCase(type)) {
            return getApple();
        } else if ("banana".equalsIgnoreCase(type)) {
            return getBanana();
        } else {
            throw new RuntimeException("没有找到对应的 Type");
        }

    }

    public static Fruit getForClassName(String className) {
        try {
            Class aClass = Class.forName(className);
            return (Fruit) aClass.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("简单工厂构造失败:[" + className + "]", e);
        }

    }

}
