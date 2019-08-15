package com.darian.pattern_23._25_Visitor;


public interface Visitor {
    void visit(Park park);

    void visit(ParkA parkA);

    void visit(ParkB parkB);
}
