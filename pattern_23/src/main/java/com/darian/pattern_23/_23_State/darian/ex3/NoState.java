package com.darian.pattern_23._23_State.darian.ex3;

public class NoState extends State {

	public void doSomething(Person person) {
		System.out.println(person.getHour() +  "--NoState.doSomething...");
	}

}
