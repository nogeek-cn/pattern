package com.darian.pattern_23._30_LoD;

public class MainClass {
    public static void main(String[] args) {
        SomeOne zhangsan = new SomeOne();
        zhangsan.play(new Friend());
        zhangsan.play(new Stranger());
    }
}
