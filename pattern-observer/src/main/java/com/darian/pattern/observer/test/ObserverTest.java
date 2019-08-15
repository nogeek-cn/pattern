package com.darian.pattern.observer.test;

import com.darian.pattern.observer.core.Event;
import com.darian.pattern.observer.subject.Observer;
import com.darian.pattern.observer.subject.Subject;
import com.darian.pattern.observer.subject.SubjectEventType;

import java.lang.reflect.Method;

/**
 * <br>
 * <br>Darian
 **/
public class ObserverTest {
    public static void main(String[] args) {
        try {
            // 观察者
            Observer observer = new Observer();
            Method advice = observer.getClass().getMethod("advice", new Class<?>[]{Event.class});
            // 这里写 Lily
            Subject subject = new Subject();
            subject.addListener(SubjectEventType.ON_ADD, observer, advice);
            subject.addListener(SubjectEventType.ON_REMOVE, observer, advice);

            subject.add();
            subject.remore();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
