package com.darian.pattern.factory.AbstarctFactory;

/**
 *
 * <br>Darian
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();
        /**
         * 对于用户而言，更加简单明了
         * 用户只有选择的权力了，保证了程序的健壮性
         **/
        System.out.println(milkFactory.getMengNiu());
        System.out.println(milkFactory.getYiLi());
    }
}
