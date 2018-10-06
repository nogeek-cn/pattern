package com.darian.pattern.singleton.lazy;

/**
 * 懒汉式单例，
 * 特点：在外部类被调用的时候，内部类才会被加载
 * 内部类一定是要在方法调用之前初始化
 * 巧妙的避免了线程安全问题
 *
 * 这种形式兼顾了懒汉式的内存浪费，也兼顾 synchronized 性能问题
 * 完美的屏蔽了这两个缺点
 * 史上最牛逼的单例的模式的实现方式
 **/
public class LazyThreeBoolean {
    private static boolean initialized = false;

    // 默认使用 LazyThreeStatic 的时候，会先初始化内部类，
    // 如果没使用的话，内部类是不加载的。

    private LazyThreeBoolean() {
        synchronized (LazyThreeBoolean.class) {
            if (initialized == false) {
                initialized = !initialized;
            }else {
                throw new RuntimeException("单例已经被侵犯！！！");
            }
        }
    }

    // 每一个关键字都不是多余的
    // static 是为了单例的空间能够共享
    // final 保证这个放啊发不会被重写，重载
    public static final LazyThreeBoolean getInstence() {
        // 在返回结果以前，一定会加载内部类
        return LazyThreeBoolean.LazyHolder.LAZY_THREE_BOOLEAN;
    }

    // 默认不加载
    private static class LazyHolder {
        private static final LazyThreeBoolean LAZY_THREE_BOOLEAN = new LazyThreeBoolean();
    }
}
