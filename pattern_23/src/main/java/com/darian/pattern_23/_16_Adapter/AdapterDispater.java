package com.darian.pattern_23._16_Adapter;

public class AdapterDispater {
	private Current current;
	
	public AdapterDispater(Current current) {
		this.current = current;
	}
	
	public void use18V() {
		System.out.println("AdapterDispater....use18V......");
		this.current.use220V();
	}
}
