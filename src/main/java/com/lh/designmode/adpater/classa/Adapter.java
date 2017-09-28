package com.lh.designmode.adpater.classa;

/**
 * Created by LH 2446059046@qq.com on 2017/9/27.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void simpleOperation2() {
        System.out.println("简单操作2...");
    }
}
