package com.darian.pattern_23._09_Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt() {
        this.strategy.encrypt();
    }
}
