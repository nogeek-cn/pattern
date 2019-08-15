package com.darian.pattern.singleton.hungry;

/**
 * 饿汉式单例
 * 它实在类加载的时候就立即初始化，并且创建单例对象
 * <p>
 * 优点： 没有加任何的锁、执行效率比较高
 * 在用户体验上来说，比懒汉式更好
 * <p>
 * 缺点：类加载的时候就初始化，不管你用还是不用，我都站着空间
 * 浪费了内存，有可能站着茅坑不拉屎
 * <p>
 * 绝对线程安全，在线程还没出现以前就实例化了，就不能有线程安全问题
 **/
public class Hungry {
    private Hungry() {
    }

    // 先静态、后动态
    // 先属性、后方法
    // 先上、后下
    private static final Hungry HUNGRY = new Hungry();

    public static Hungry getInstence() {
        return HUNGRY;
    }
}
