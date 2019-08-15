package com.darian.pattern_23._12_Proxy;

public class ProxySubject implements Subject {
    private RealSubject realSubject;

    public void sailBook() {
        begfore();
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.sailBook();
        after();
    }

    public void begfore() {
        System.out.println("ProxySubject.begfore......");
    }

    public void after() {
        System.out.println("�ProxySubject.after.....");
    }
}
