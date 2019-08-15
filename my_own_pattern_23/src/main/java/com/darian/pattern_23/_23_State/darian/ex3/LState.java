package com.darian.pattern_23._23_State.darian.ex3;

public class LState extends State {

    public void doSomething(Person person) {
        if (person.getHour() == 12) {
            System.out.println("person.getHour() == 12");
        } else {
            person.setState(new SState());
            person.doSomething();
        }
    }

}
