package com.darian.pattern.proxy.custom;

import java.io.*;

/**
 * <br>
 * <br>Darian
 **/
public class DarianClassLoader extends ClassLoader {

    private File classPathFile;

    public DarianClassLoader() {
//            String filePath = DarianClassLoader.class.getResource("").getPath();
//            System.out.println(filePath);
//            File f = new File(  "/$Proxy00.java");
        this.classPathFile = new File("src\\main\\java\\com\\darian\\pattern\\proxy\\custom\\");
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = DarianClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;

                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1) {
                        out.write(buff, 0, len);
                    }
                    return defineClass(className, out.toByteArray(), 0, out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (null != in) {
                            in.close();
                        }
                        if (null != out) {
                            out.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }
}
