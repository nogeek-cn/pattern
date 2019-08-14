package com.darian.pattern_23._25_Visitor;


public class VisitorB implements Visitor {

	public void visit(Park park) {

	}

	public void visit(ParkA parkA) {

	}

	public void visit(ParkB parkB) {
		System.out.println("VisitorB.visit(ParkB parkB)" + parkB.getName());
	}

}
