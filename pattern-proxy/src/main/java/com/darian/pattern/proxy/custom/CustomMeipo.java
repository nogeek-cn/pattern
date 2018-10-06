package com.darian.pattern.proxy.custom;

import com.darian.pattern.staticed.Person;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <br>
 * <br>Darian
 **/
public class CustomMeipo implements DarianInvocationHandler {

    // 被代理的对象，把引用给保存下来
    public Person target;

    public Object getInstence(Person target) throws Exception {
        this.target = target;
        Class<? extends Person> clazz = target.getClass();

        // 下半节，深入底层将界字节码是如何重组的。
        // 用来生成一个新的对象（字节码重组来实现）
        //  public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h)
        return  DarianProxy.newProxyInstance(new DarianClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆，我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
        System.out.println();
        method.invoke(this.target,args);
        System.out.println();
        System.out.println("如果合适的话，就准备办事！");
        return null;
    }
}
