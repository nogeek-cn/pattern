package com.darian.pattern.singleton.register;

/**
 * 在常量中去使用
 * 常量不就是用来大家都去使用的吗
 **/
public enum Color {
    RED(){
        private int r = 255;
    },
    BLACK(){
        private int r = 1;
    },
    WHITE(){
        private int r = 3;
    }
}
