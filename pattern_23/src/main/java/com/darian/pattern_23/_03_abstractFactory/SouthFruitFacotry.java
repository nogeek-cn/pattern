package com.darian.pattern_23._03_abstractFactory;

public class SouthFruitFacotry implements FruitFactory {
    @Override
    public Apple getApple() {
        return new SouthApple();
    }

    @Override
    public Banana getBanana() {
        return new SouthBanana();
    }
}
