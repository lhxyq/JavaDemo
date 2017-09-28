package com.lh.designmode.adpater.objecta;

/**
 * Created by LH 2446059046@qq.com on 2017/9/27.
 */
public class Demo {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.simpleOperation1();
        target.simpleOperation2();
    }
}
