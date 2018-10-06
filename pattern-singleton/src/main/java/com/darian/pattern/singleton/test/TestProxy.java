package com.darian.pattern.singleton.test;

import com.darian.pattern.singleton.lazy.LazyThreeBoolean;
import com.darian.pattern.singleton.lazy.LazyThreeStatic;

import java.lang.reflect.Constructor;

/**
 * <br>
 * <br>Darian
 **/
public class TestProxy {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyThreeBoolean.class;
            // 通过反射拿到私有的构造方法。
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            // 强制访问，强吻，不愿意也要问
            constructor.setAccessible(true);
            // 暴力初始化
            Object o1 = constructor.newInstance();
            // 调用了两次构造方法，相当于 new 了两次
            // 犯了原则性问题，
            Object o2 = constructor.newInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
