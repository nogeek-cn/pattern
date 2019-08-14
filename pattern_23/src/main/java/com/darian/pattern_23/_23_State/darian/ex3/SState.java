package com.darian.pattern_23._23_State.darian.ex3;

public class SState extends State {

	public void doSomething(Person person) {
		if(person.getHour() == 18) {
			System.out.println("person.getHour() == 18");
		} else {
			person.setState(new NoState());
			person.doSomething();
		}
	}

}
