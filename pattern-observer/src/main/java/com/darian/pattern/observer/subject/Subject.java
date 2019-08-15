package com.darian.pattern.observer.subject;

import com.darian.pattern.observer.core.EventListener;

/**
 * <br>
 * <br>Darian
 **/
public class Subject extends EventListener {

    // 通常说的话，采用动态代理实现监控，避免代码侵入

    public void add() {
        System.out.println("调用一个添加的方法");
        trigger(SubjectEventType.ON_ADD);
    }

    public void remore() {
        System.out.println("调用删除的方法");
        trigger(SubjectEventType.ON_REMOVE);
    }
}
