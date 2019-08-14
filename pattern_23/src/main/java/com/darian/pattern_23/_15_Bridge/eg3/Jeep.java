package com.darian.pattern_23._15_Bridge.eg3;

public class Jeep extends Car {

	public Jeep(Engine engine) {
		super(engine);
	}

	public void installEngine() {
		System.out.print("Jeep....installEngine......");
		this.getEngine().installEngine();
	}

}
