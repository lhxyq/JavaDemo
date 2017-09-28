package com.lh.designmode.adpater.objecta;

/**
 * Created by LH 2446059046@qq.com on 2017/9/27.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void simpleOperation1() {
        adaptee.simpleOperation1();
    }

    @Override
    public void simpleOperation2() {
        System.out.println("简单操作2...");
    }
}
