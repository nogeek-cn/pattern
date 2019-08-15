package com.darian.pattern_23._03_abstractFactory;

public class TestMain {
    public static void main(String[] args) {
        new SouthFruitFacotry().getApple().get();
        new SouthFruitFacotry().getBanana().get();

        new NorthFruitFacotry().getApple().get();
        new NorthFruitFacotry().getBanana().get();
    }
}
