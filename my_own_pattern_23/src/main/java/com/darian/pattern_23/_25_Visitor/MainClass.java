package com.darian.pattern_23._25_Visitor;

public class MainClass {
    public static void main(String[] args) {
        Park park = new Park();
        park.setName("darian");
        VisitorA visitorA = new VisitorA();

        park.accept(visitorA);

        VisitorB visitorB = new VisitorB();
        park.accept(visitorB);

        VisitorManager visitorManager = new VisitorManager();
        park.accept(visitorManager);
    }
}
