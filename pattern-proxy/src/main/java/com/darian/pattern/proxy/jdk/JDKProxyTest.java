package com.darian.pattern.proxy.jdk;

import com.darian.pattern.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * <br>
 * <br>Darian
 **/
public class JDKProxyTest {
    public static void main(String[] args) throws Exception {
//        Person person = (Person)new JDKMeiPo().getInstence(new XieMu());
//        person.findLove();
        Person person = (Person)new JDK58().getInstence(new XieMu());
        System.out.println(person.getClass());
        person.findJob();

        // 原理：
//        1. 拿到被代理的对象的引用，并且获取到它的所有接口，反射获取
//        2. JDK Proxy 类重新生成一个新的类，同时新的类要实现被代理类的所有实现
//        3. 动态的生成 Java 代码,把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
//        4. 编译新生成的 Java 代码， .class
//        5. 再重新加载到 JVM 中运行
//        以上这个过程就叫字节码重组


//        JDK 中有个规范，只要是 $ 开头的一般都是自动生成的。
//        通过反编译工具可以查看源代码。
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream fileOutputStream = new FileOutputStream("$Proxy0.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
