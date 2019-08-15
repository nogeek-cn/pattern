package com.darian.pattern_23._25_Visitor;


public class ParkA implements ParkElement {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
