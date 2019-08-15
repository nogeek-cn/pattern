package com.darian.pattern.singleton.lazy;

/**
 * 懒汉式单例
 * 在外部需要使用的时候才能够进行实例化
 **/
public class LazyOne {
    private LazyOne() {
    }

    // 静态快，公共内存区域
    private static LazyOne lazy = null;

    public static LazyOne getInstence() {
        // 调用方法之前，先判断
        // 如果没有初始化，将其进行初始化，并且赋值
        // 将该实例缓存好
        if (lazy == null) {
            // 两个线程都会进入这个 if 方法
            lazy = new LazyOne();
        }
        // 如果已经初始化，直接返回之前已经保存好的结果
        return lazy;
    }
}
