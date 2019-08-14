package com.darian.pattern_23._03_abstractFactory;

public class NorthFruitFacotry implements FruitFactory{
    @Override
    public Apple getApple() {
        return new NorthApple();
    }

    @Override
    public Banana getBanana() {
        return new NorthBanana();
    }
}
