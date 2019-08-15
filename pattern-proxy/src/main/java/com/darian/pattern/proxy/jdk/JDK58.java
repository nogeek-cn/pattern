package com.darian.pattern.proxy.jdk;

import com.darian.pattern.staticed.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <br>
 * <br>Darian
 **/
public class JDK58 implements InvocationHandler {
    // 被代理的对象，把引用给保存下来
    public Person target;

    public Object getInstence(Person target) throws Exception {
        this.target = target;
        Class<? extends Person> clazz = target.getClass();

        // 下半节，深入底层将界字节码是如何重组的。
        // 用来生成一个新的对象（字节码重组来实现）
        //  public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是58，我要给你找工作，现在已经拿到你的简历");
        System.out.println("开始投递");
        method.invoke(this.target, args);
        System.out.println("安排面试");
        return null;
    }
}
