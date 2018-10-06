package com.darian.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * 反序列化导致单例破坏
 **/
public class Seriable implements Serializable {

    // 序列化就是把内存中的状态通过转换成字节码的形式
    // 从而转化成一个 I/O 流，写入到其他地方（可以是磁盘，网络 I/O）
    // 内存中状态给永久保存下来了

    // 反序列化
    // 将已经持久化的字节码内容，转化为 I/O 流
    // 通过 I/O 流的读取，进而将读取的内容转换为 JAVA 对象
    // 在转化过程中会重新创建对象 new 

    public final static  Seriable INSTANCE = new Seriable();

    private Seriable(){}
    public static Seriable getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }

}
