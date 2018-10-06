package com.darian.pattern.proxy.custom;


import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileOutputStream;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * <br>
 * <br>Darian
 **/
public class DarianProxy {

    public static String ln = "\r\n";

    public static Object newProxyInstance(DarianClassLoader classLoader, Class<?>[] interfaces, DarianInvocationHandler h) {
        try {
            // 1. 动态生成源代码 .java 文件

            String src = generaterSrc(interfaces);
            // 2. JAVA 文件输出到磁盘
//            String filePath = DarianProxy.class.getResource("").getPath();
//            System.out.println(filePath);
//            File f = new File(  "/$Proxy00.java");
//            FileWriter fw = new FileWriter(f);
//            fw.write(src);
//            fw.flush();
//            fw.close();
            FileOutputStream fileOutputStream = new FileOutputStream("src\\main\\java\\com\\darian\\pattern\\proxy\\custom\\$Proxy0.java");
            fileOutputStream.write(src.getBytes());
            fileOutputStream.close();
            File file = new File("src\\main\\java\\com\\darian\\pattern\\proxy\\custom\\$Proxy0.java");

            // 3. 把 .java 文件编译成 .class 文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            // 4. 编译生成的 .class 文件加载到 JVM 中，
            Class<?> proxyClass = classLoader.findClass("$Proxy0");
            Constructor<?> constructor = proxyClass.getConstructor(DarianInvocationHandler.class);

            // 5. 返回字节码重组以后的新的代理对象
            constructor.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generaterSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.darian.pattern.proxy.custom;" + ln);
        sb.append("import com.darian.pattern.staticed.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);

            sb.append("DarianInvocationHandler h;" + ln);
            sb.append("public $Proxy0(DarianInvocationHandler h){" + ln);
                sb.append("this.h = h;");
            sb.append("}" + ln);

            for (Method m : interfaces[0].getMethods()) {
                sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(){" + ln);
                    sb.append("try{" + ln);
                        sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
                        sb.append("this.h.invoke(this, m, null);" + ln);
                    sb.append("}catch(Throwable e){" + ln);
                        sb.append("e.printStackTrace();" + ln);
                    sb.append("}" + ln);
                sb.append("}");
            }
        sb.append("}" + ln);
        return sb.toString();
    }
}
