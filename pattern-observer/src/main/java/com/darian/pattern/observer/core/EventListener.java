package com.darian.pattern.observer.core;


import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件的注册和监听
 * <br>Darian
 **/
public class EventListener {

    protected Map<Enum, Event> events = new HashMap<>();

    public void addListener(Enum eventType, Object target, Method callback) {
        // 注册时间
        // 用反射调用这个方法
        events.put(eventType, new Event(target, callback));
    }

    private void trigger(Event e) {
        e.setSource(this);
        e.setTime(new Date());

        try {
            e.getCallback().invoke(e.getTarget(), e);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    protected void trigger(Enum call) {
        if (!this.events.containsKey(call)) {
            return;
        }
        trigger(this.events.get(call).setTrigger(call.toString()));
    }
}
