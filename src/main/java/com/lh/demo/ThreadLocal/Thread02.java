package com.lh.demo.ThreadLocal;

/**
 * Created by LH 2446059046@qq.com on 2017/9/20.
 */
public class Thread02 implements Runnable {

    public Thread02() {
    }

    @Override
    public void run() {
        Person person = PersonManger.getPerson();
        person.setName("向雅琴");
        person.setSex("女");
        person.setAge(23);
    }
}
