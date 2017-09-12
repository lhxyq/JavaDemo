package com.lh.demo.hotfix;

import java.io.*;

/**
 * Created by LH 2446059046@qq.com on 2017/9/11.
 */
public class MyClassLoader extends ClassLoader {

    public MyClassLoader() {
    }

    /*private static class LazyClass {
        public final static MyClassLoader myClassLoader = new MyClassLoader();
    }

    public static MyClassLoader getInstance() {
        return LazyClass.myClassLoader;
    }*/

    private byte[] getBytes(String fileName) {
        try {
            InputStream in = new FileInputStream(fileName);
            if (null == in)
                return null;
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            byte[] bytes = new byte[1024];
            int num = 0;
            while ((num = in.read(bytes))  > 0) {
                out.write(bytes, 0, num);
            }

            return out.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected Class<?> findClass(String name) {
        byte[] bytes = getBytes(name);
        return defineClass(null, bytes, 0, bytes.length);
    }

    /*public Object findNewClass(String classPath) throws IOException, InstantiationException, IllegalAccessException {
        byte[] bytes = getBytes(classPath);
        return defineClass(null, bytes, 0, bytes.length).newInstance();
    }

    public  static <T> T reloadClass(Object o) {
        return (T) o;
    }*/
}
