package com.darian.pattern.decorator.test;

import java.io.DataInputStream;
import java.io.InputStream;

/**
 * <br>
 * <br>Darian
 **/
public class DecotratorTest {
    public static void main(String[] args) {
        // 为了某个实现类再不修改原始类的基础上进行动态的覆盖或者增加方法。
        // 该实现保持跟原有类的继承关系
        // 采用装饰模式
        // 装饰器模式实际上是一种非常特殊的适配器模式

        // 虽然 DAtaInputStream 功能更强太
        // DataInputStream 同样去实现 InputStrem
        InputStream in = null;
        DataInputStream fis = new DataInputStream(in);
    }
}
