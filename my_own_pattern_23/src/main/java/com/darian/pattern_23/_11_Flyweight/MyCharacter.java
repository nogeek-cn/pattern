package com.darian.pattern_23._11_Flyweight;

public class MyCharacter {
    private char mychar;

    public MyCharacter(char mychar) {
        this.mychar = mychar;
    }

    public void display() {
        System.out.println(mychar);
    }
}
