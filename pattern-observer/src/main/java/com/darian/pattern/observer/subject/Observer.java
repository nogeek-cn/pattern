package com.darian.pattern.observer.subject;

import com.darian.pattern.observer.core.Event;

/**
 * <br>
 * <br>Darian
 **/
public class Observer {
    public void advice(Event e) {
        System.out.println("=======触发事件，打印日志=========\n" + e);

        /**
         * input
         * input.addListener("click", function(){
         * })
         **/
    }
}
