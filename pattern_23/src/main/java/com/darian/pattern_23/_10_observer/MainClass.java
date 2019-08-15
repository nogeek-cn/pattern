package com.darian.pattern_23._10_observer;

public class MainClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.addObserver(new MyObServer());
        person.addObserver(new MyObServer());
        System.out.println("person.countObservers():" + person.countObservers());

        person.setName("lifengxing");
        person.setAge(23);
        person.setSex("男");
    }
}
