package com.darian.pattern_23._09_Strategy.darian;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public double cost(double num){
		return this.strategy.cost(num);
	}
	
}
