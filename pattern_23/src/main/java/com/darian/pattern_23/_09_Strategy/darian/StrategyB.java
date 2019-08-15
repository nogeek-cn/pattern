package com.darian.pattern_23._09_Strategy.darian;

public class StrategyB implements Strategy {

    public double cost(double num) {
        if (num >= 200) {
            return num - 50;
        }
        return num;
    }

}
