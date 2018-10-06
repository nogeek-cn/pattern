package com.darian.pattern.strategy.pay.test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * <br>
 * <br>Darian
 **/
public class ComparableTest {
    public static void main(String[] args) {
        // 这就是一个策略模式
        new ArrayList<Object>().sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}
