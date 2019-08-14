package com.darian.pattern_23._08_Decorator.darian;

public class FlyCarDecorator extends CarDecorator{

	public FlyCarDecorator(Car car) {
		super(car);
	}

	public void show() {
		this.getCar().show();
		this.fly();
	}
	
	public void fly() {
		System.out.println("FlyCarDecorator -- fly");
	}

	public void run() {
		
	}
}
