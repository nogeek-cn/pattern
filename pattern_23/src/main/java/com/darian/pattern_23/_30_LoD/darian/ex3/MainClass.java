package com.darian.pattern_23._30_LoD.darian.ex3;

public class MainClass {
	public static void main(String[] args) {
		SomeOne zhangsan = new SomeOne();
		zhangsan.setFriend(new Friend());
		zhangsan.getFriend().playWithStranger();
	}
}
