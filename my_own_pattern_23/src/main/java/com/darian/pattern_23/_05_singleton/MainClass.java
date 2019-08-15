package com.darian.pattern_23._05_singleton;

public class MainClass {
    public static void main(String[] args) {
        Person2 per = Person2.getPerson();
        Person2 per2 = Person2.getPerson();

        System.out.println(per == per2);

    }
}
