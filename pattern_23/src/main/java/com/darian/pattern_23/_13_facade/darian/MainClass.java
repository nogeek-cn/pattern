package com.darian.pattern_23._13_facade.darian;

public class MainClass {
	public static void main(String[] args) {

//		Gupiao gupiao = new Gupiao();
//		gupiao.mai();
//		
//		Qihuo qihuo = new Qihuo();
//		qihuo.chao();
//		
//		GuoZai guozhai = new GuoZai();
//		guozhai.mai();

		JiJin jijin = new JiJin();
		jijin.maiJijinA();
		System.out.println("===========");
		jijin.maiJijinB();

	}
}
