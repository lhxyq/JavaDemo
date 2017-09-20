package com.lh.demo.hotfix;

import java.io.File;
import java.lang.reflect.Method;

/**
 * Created by LH 2446059046@qq.com on 2017/9/12.
 */
public class Demo implements Runnable{
    public final static String CLASS_PATH = "E:\\document\\lh\\program\\JavaDemo\\target\\classes\\com\\lh\\demo\\hotfix";
    public final static String SOURCE_PATH = "E:\\document\\lh\\program\\JavaDemo\\src\\main\\java\\com\\lh\\demo\\hotfix";


    public Demo() {
    }

    @Override
    public void run() {
        try {
            File sourceFile = new File(SOURCE_PATH + File.separatorChar + "Dog.java");
            File classFile = new File(CLASS_PATH + File.separatorChar + "Dog.class");
            while (true) {
                if (sourceFile.lastModified() < classFile.lastModified()) {
                    System.out.println("class file have changed...");

                    /*Class<?> cls = new MyClassLoader(CLASS_PATH).findClass("com.lh.demo.hotfix.Dog");
                    Object ob = cls.newInstance();
                    Method method = ob.getClass().getMethod("speak", new Class[]{});
                    method.invoke(ob, new Object[] {});*/
                    MyClassLoader myClassLoader = new MyClassLoader("");
                    myClassLoader.setPath(CLASS_PATH);
                    Class<?> cls = myClassLoader.findClass("com.lh.demo.hotfix.Dog");
                    Animal animal = (Animal)cls.newInstance();
                    animal.speak();
                }

                Thread.sleep(3000);
                System.out.println("wait...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Thread(new Demo()).start();

    }
}
