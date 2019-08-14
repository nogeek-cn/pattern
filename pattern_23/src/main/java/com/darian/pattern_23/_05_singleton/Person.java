package com.darian.pattern_23._05_singleton;

public class Person {
	public static final Person person = new Person();

	//构造函数私有化
	private Person() {
	}

	//提供一个全局的静态方法
	public static Person getPerson() {
		return person;
	}
}
