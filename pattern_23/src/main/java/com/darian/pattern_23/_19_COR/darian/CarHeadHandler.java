package com.darian.pattern_23._19_COR.darian;

public class CarHeadHandler extends CarHandler {

    public void HandlerCar() {
        System.out.println("CarHeadHandler....HandlerCar..");
        if (this.carHandler != null) {
            this.carHandler.HandlerCar();
        }
    }

}
