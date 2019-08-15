package com.darian.pattern_23._19_COR.darian;

public class CarBodyHandler extends CarHandler {

    public void HandlerCar() {
        System.out.println("CarBodyHandler。。HandlerCar。。。。。");
        if (this.carHandler != null) {
            this.carHandler.HandlerCar();
        }
    }

}
