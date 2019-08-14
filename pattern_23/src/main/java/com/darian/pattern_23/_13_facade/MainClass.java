package com.darian.pattern_23._13_facade;

public class MainClass {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.doABC();
		System.out.println("=================");
		facade.doAB();
	}
}
