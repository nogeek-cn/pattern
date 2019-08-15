package com.darian.pattern_23._19_COR.darian;

public abstract class CarHandler {
    protected CarHandler carHandler;

    public CarHandler setNextHandler(CarHandler carHandler) {
        this.carHandler = carHandler;
        return this.carHandler;
    }

    public abstract void HandlerCar();
}
