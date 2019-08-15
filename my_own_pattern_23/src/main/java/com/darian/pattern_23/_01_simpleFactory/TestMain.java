package com.darian.pattern_23._01_simpleFactory;

public class TestMain {
    public static void main(String[] args) {
        // ---- v1
        Fruit apple = FruitFactory.getApple();
        Fruit banana = FruitFactory.getBanana();
        apple.get();
        banana.get();

        // -- v2
        FruitFactory.get("apple").get();
        FruitFactory.get("banana").get();


        // -- v3
        FruitFactory.getForClassName(Apple.class.getName()).get();
        FruitFactory.getForClassName(Banana.class.getName()).get();

    }
}
