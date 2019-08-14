package com.darian.pattern_23._30_LoD.darian.ex2;

public class Friend {
	public void play(){
		System.out.println("friends paly");
	}
	
	public Stranger getStranger() {
		return new Stranger();
	}
}
