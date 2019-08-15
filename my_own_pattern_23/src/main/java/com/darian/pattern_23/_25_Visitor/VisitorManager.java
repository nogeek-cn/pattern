package com.darian.pattern_23._25_Visitor;

public class VisitorManager implements Visitor {

    public void visit(Park park) {
        System.out.println("VisitorManager.visit(Park park)" + park.getName());
    }

    public void visit(ParkA parkA) {
        System.out.println("VisitorManager. visit(ParkA parkA)" + parkA.getName());
    }

    public void visit(ParkB parkB) {
        System.out.println("VisitorManager.visit(ParkB parkB)" + parkB.getName());
    }

}
