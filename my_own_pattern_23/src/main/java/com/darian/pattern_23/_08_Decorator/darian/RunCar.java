package com.darian.pattern_23._08_Decorator.darian;

public class RunCar implements Car {

    public void run() {
        System.out.println("RunCar -- run");
    }

    public void show() {
        this.run();
    }

}
