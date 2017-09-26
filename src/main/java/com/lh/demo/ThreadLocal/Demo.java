package com.lh.demo.ThreadLocal;

/**
 * Created by LH 2446059046@qq.com on 2017/9/20.
 */
public class Demo {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new Thread01(), "01");
        Thread thread02 = new Thread(new Thread02(), "02");
        thread01.start();
        thread02.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person person = PersonManger.getPerson();
        System.out.println("name:\t" + person.getName());
        System.out.println("age:\t" + person.getAge());
        System.out.println("sex:\t" + person.getSex());
    }
}
