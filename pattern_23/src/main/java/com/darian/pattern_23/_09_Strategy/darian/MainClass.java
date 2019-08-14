package com.darian.pattern_23._09_Strategy.darian;

public class MainClass {
    public static void main(String[] args) {
        double num = 200;
        Context context = new Context(new StrategyB());
        double newNum = context.cost(num);
        System.out.println("StrategyB (" + num + ") 结果: " + newNum + " ms ");

        newNum = new Context(new StrategyA()).cost(num);
        System.out.println("StrategyA (" + num + ") 结果: " + newNum + " ms ");
    }
}
