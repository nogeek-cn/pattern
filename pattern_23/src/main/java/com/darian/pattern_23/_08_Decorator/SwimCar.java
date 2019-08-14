package com.darian.pattern_23._08_Decorator;

public class SwimCar implements Car{

	public void run() {
		System.out.println("SwimCar - run");
	}

	public void Swim() {
		System.out.println("SwimCar - Swim");
	}
	
	public void show() {
		this.run();
		this.Swim();
	}

}
