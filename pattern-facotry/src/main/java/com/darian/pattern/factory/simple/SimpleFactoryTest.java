package com.darian.pattern.factory.simple;

import com.darian.pattern.factory.TeLunSu;

/**
 * <br>
 * <br>Darian
 **/
public class SimpleFactoryTest {

    public static void main(String[] args) {

        // 这个 new 的过程实际上是一个比较复杂的过程
        // 有人民币就不需要自己 new 了
        // System.out.println(new TeLunSu().getName());

        // 小作坊式的生产模式
        // 用户不再关心生产的过程，而只需要关心这个结果

        // 假如：特仑苏、伊利、蒙牛
        // 成分配都是不一样的
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getMilk("TeLunSu"));
        System.out.println(simpleFactory.getMilk("YiLi"));
        System.out.println(simpleFactory.getMilk("MengNiu"));
    }
}
