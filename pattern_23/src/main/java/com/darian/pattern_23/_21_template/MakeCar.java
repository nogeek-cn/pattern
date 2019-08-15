package com.darian.pattern_23._21_template;

/**
 * MakeCar
 */
public abstract class MakeCar {
    //makeHead
    public abstract void makeHead();

    //makeBody
    public abstract void makeBody();

    // makeTail
    public abstract void makeTail();

    public void make() {
        this.makeHead();
        this.makeBody();
        this.makeTail();
    }
}
