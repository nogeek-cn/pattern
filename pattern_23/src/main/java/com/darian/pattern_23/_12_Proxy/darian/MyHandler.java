package com.darian.pattern_23._12_Proxy.darian;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
	private RealSubject realSubject;
	
	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	public Object invoke(Object proxy, Method method, Object[] args){
		Object result = null;
		begfore();
		try {
			result = method.invoke(realSubject, args);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		after();
		return result;
	}
	
	public void begfore() {
		System.out.println("MyHandler.begfore....");
	}
	
	public void after() {
		System.out.println("MyHandler.after.......");
	}

}
