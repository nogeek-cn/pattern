package com.darian.pattern_23._08_Decorator;

public class FlyCar implements Car {

	public void show() {
		this.run();
		this.fly();
	}

	public void run() {
		System.out.println("FlyCar - run");
	}
	
	public void fly() {
		System.out.println("FlyCar - fly");
	}
}
