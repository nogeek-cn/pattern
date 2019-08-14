package com.darian.pattern_23._12_Proxy.darian;

import java.lang.reflect.Proxy;

public class MainClass {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		MyHandler myHandler = new MyHandler();
		myHandler.setRealSubject(realSubject);
		
		Subject proxySubject = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
				realSubject.getClass().getInterfaces(), myHandler);
		proxySubject.sailBook();
	}
}
