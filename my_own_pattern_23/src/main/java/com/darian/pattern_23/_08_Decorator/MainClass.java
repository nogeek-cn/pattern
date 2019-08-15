package com.darian.pattern_23._08_Decorator;

public class MainClass {
    public static void main(String[] args) {
        Car car = new SwimCar();
        car.show();

        car = new FlyCar();
        car.show();

        car = new RunCar();
        car.show();
    }
}
