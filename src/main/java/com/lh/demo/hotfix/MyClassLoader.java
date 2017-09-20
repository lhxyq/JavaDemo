package com.lh.demo.hotfix;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by LH 2446059046@qq.com on 2017/9/12.
 */
public class MyClassLoader extends ClassLoader {
    public String path = "";

    private MyClassLoader() {

    }

    public MyClassLoader(String path) {
        this.path = path;
    }

    public static MyClassLoader getInstance() {
        return Lazy.classLoader;
    }

    private static class Lazy {
        public static final MyClassLoader classLoader = new MyClassLoader();
    }

    @Override
    protected Class<?> findClass(String name) {
        String classFileName = getClassName(name);
        byte[] bytes = getBytes(path + File.separatorChar + classFileName);
        return defineClass(name, bytes, 0, bytes.length);
    }

    private byte[] getBytes(String file) {
        byte[] result;
        try (InputStream in = new FileInputStream(file);
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {

            byte[] bytes = new byte[1024];
            int len = 0;

            while ((len = in.read(bytes)) > 0) {
                out.write(bytes, 0, len);
            }

            result = out.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            result = null;
        }

        return result;
    }

    private String getClassName(String name) {
        int index = name.lastIndexOf(".");

        if (index == -1)
            return name + ".class";
        else
            return name.substring(index + 1) + ".class";
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
