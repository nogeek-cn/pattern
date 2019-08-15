package com.darian.pattern_23._23_State.darian.ex3;

public class MState extends State {

    public void doSomething(Person person) {
        if (person.getHour() == 7) {
            System.out.println("person.getHour() == 7");
        } else {
            person.setState(new LState());
            person.doSomething();
        }
    }

}
