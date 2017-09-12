package com.lh.demo.hotfix;

/**
 * Created by LH 2446059046@qq.com on 2017/9/11.
 */
public class Test implements RefChange{
    public Test() {
        ClassWatcher.getInstance().startServers();
    }

    @Override
    public void reoadClass(Object o) {

    }

    public static void main(String[] args) {
        new Test();
    }
}
