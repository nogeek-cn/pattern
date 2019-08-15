package com.darian.pattern_23._10_observer;

import java.util.Observable;
import java.util.Observer;

public class MyObServer implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o + " update: " + arg);
    }
}
