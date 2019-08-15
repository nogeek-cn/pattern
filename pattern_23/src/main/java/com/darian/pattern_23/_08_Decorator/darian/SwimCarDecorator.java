package com.darian.pattern_23._08_Decorator.darian;

public class SwimCarDecorator extends CarDecorator {

    public SwimCarDecorator(Car car) {
        super(car);
    }

    public void show() {
        this.getCar().show();
        this.swim();
    }

    public void swim() {
        System.out.println("SwimCarDecorator - swim");
    }

    public void run() {

    }

}
