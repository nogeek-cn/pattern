package com.darian.pattern.staticed;

/**
 * <br>
 * <br>Darian
 **/
public class StaticProxyTest {
    public static void main(String[] args) {
        // 只能帮儿子找对象
        // 不能帮表妹、陌生人
        Father father = new Father(new Son());
        father.findLove();
    }
}
