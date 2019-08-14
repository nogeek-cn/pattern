package com.darian.pattern_23._02_factoryMethod;

public class BananaFactory implements FruitFactory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
