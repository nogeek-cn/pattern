package com.darian.pattern_23._02_factoryMethod;

public class TestMain {
    public static void main(String[] args) {
        FruitFactory factory = new AppleFactory();
        factory.getFruit().get();

        new BananaFactory().getFruit().get();
    }
}
