package com.darian.pattern.singleton.test;

import com.darian.pattern.singleton.lazy.LazyThreeStatic;

import java.lang.reflect.InvocationTargetException;

/**
 * <br>
 * <br>Darian
 **/
public class TimeTest {
    public static void main(String[] args)   {
        long start = System.currentTimeMillis();
        int count = 20000000;
        for (int i = 0; i < count; i++) {
//            LazyTwo.getInstence();
//            LazyOne.getInstence();
            LazyThreeStatic.getInstence();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));
    }
}
