package com.darian.pattern.observer.core;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * <br>
 * <br>Darian
 **/
public class Event {

    // 事件源 ( set 方法, 只有同一个包下可以调用)
    private Object source;
    // 通知目标
    private Object target;
    // 回调
    private Method callback;
    // 触发 ( set 方法, 只有同一个包下可以调用)
    private String trigger;
    // 时间
    private Date time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public Date getTime() {
        return time;
    }

    Event setTime(Date time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" + "\n" +
                "\tsource=" + source + "，\n" +
                "\ttarget=" + target + "，\n" +
                "\tcallback=" + callback + "，\n" +
                "\ttrigger='" + trigger + '\'' + "，\n" +
                "\ttime=" + time + "，\n" +
                '}';
    }
}
