package com.darian.pattern_23._09_Strategy;

public class MainClass {
	public static void main(String[] args) {
//		Strategy stra = new MDSStrategy();
//		stra.encrypt();

		Context context = new Context(new MDSStrategy());
		context.encrypt();

		new Context(new MD5Strategy()).encrypt();
	}
}
