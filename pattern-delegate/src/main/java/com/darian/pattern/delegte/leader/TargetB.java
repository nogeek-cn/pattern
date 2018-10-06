package com.darian.pattern.delegte.leader;

/**
 * <br>
 * <br>Darian
 **/
public class TargetB implements ITarget {
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command);
    }
}
