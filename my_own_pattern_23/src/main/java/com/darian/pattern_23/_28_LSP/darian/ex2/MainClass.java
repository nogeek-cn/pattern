package com.darian.pattern_23._28_LSP.darian.ex2;

public class MainClass {
    public static void main(String[] args) {
        fly(new Laoying());
    }

    public static void fly(Bird bird) {
        bird.fly();
    }
}
