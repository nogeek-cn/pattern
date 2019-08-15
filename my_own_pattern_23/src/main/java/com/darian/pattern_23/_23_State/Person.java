package com.darian.pattern_23._23_State;

public class Person {
    private int hour;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void doSomething() {
        if (hour == 7) {
            System.out.println("hour == 7");
        } else if (hour == 12) {
            System.out.println("hour == 12");
        } else if (hour == 18) {
            System.out.println("hour == 18");
        } else {
            System.out.println(hour += 18);
        }
    }
}
