package com.darian.pattern_23._15_Bridge.eg3;

public class Bus extends Car{

	public Bus(Engine engine) {
		super(engine);
	}

	public void installEngine() {
		System.out.print("Bus......installEngine......");
		this.getEngine().installEngine();
	}
}
