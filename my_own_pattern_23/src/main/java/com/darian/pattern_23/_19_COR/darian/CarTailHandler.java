package com.darian.pattern_23._19_COR.darian;

public class CarTailHandler extends CarHandler {

    public void HandlerCar() {
        System.out.println("CarTailHandler....HandlerCar......");
        if (this.carHandler != null) {
            this.carHandler.HandlerCar();
        }
    }

}
