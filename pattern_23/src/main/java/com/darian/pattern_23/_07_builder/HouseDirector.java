package com.darian.pattern_23._07_builder;

public class HouseDirector {

    public void makeHouse(HouseBuilder builder) {
        builder.makeFloor();
        builder.makeWall();
        builder.makeHousetop();
    }

}
