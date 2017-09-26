package com.lh.demo.ThreadLocal;

/**
 * Created by LH 2446059046@qq.com on 2017/9/20.
 */
public class Thread01 implements Runnable {
//    private Person person;

    public Thread01() {
//        person = PersonManger.getPerson();
    }

    @Override
    public void run() {
        Person person = PersonManger.getPerson();
        person.setName("刘辉");
        person.setSex("男");
        person.setAge(24);
    }
}
