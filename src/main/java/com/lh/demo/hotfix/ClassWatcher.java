package com.lh.demo.hotfix;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.*;

/**
 * Created by LH 2446059046@qq.com on 2017/9/11.
 */
public class ClassWatcher implements Runnable {
    public final static String classPath = "E:\\document\\lh\\program\\JavaDemo\\target\\classes\\com\\lh\\demo\\hotfix";
    public final static String sourcePath = "E:\\document\\lh\\program\\JavaDemo\\src\\main\\java\\com\\lh\\demo\\hotfix";
    private boolean isRuner = false;
    private final static ClassWatcher classWatcher = new ClassWatcher();


    public static ClassWatcher getInstance() {
        return classWatcher;
    }

    public boolean isRun() {
        return isRuner;
    }

    public ClassWatcher startServers() {
        if (!isRun())
            new Thread(this).start();
        return this;
    }

    private void handelEvents() {
        while (true) {
            try {
                File sourceJava = new File(sourcePath + +File.separatorChar + "RefSay.java");
                File classJava = new File(classPath + File.separatorChar + "RefSay.class");
                if (sourceJava.lastModified() < classJava.lastModified()) {
                    System.err.println("发现目录下有class发生变化.进行热加载" + sourcePath);
                    Class cl = new MyClassLoader().findClass(classPath + File.separatorChar + "RefSay.class");
                    Object classTemp = cl.newInstance();
                    Method method = classTemp.getClass().getMethod("say", new Class[]{});
                    method.invoke(classTemp, new Object[]{});
                }

                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        if (!isRuner) {
            isRuner = !isRuner;
            handelEvents();
        }
        System.out.println("文件监听已运行");
    }
}
