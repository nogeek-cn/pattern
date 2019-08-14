package com.darian.pattern_23._08_Decorator;

public class RunCar implements Car {

	public void run() {
		System.out.println("RunCar - run");
	}

	public void show() {
		this.run();
	}

}
