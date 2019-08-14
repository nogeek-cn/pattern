package com.darian.pattern_23._04_testFactory;

public class SubtractionOperation extends Operation {

	public double getResult() {
		double result = this.getNum1() - this.getNum2();
		return result;
	}

}
