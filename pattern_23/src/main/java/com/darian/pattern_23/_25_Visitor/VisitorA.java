package com.darian.pattern_23._25_Visitor;


public class VisitorA implements Visitor {

	public void visit(Park park) {

	}

	public void visit(ParkA parkA) {
		System.out.println("VisitorA.visit(ParkA parkA)" + parkA.getName());
	}

	public void visit(ParkB parkB) {

	}

}
