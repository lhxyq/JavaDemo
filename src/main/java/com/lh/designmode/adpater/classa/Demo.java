package com.lh.designmode.adpater.classa;

/**
 * Created by LH 2446059046@qq.com on 2017/9/27.
 */
public class Demo {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.simpleOperation1();
        target.simpleOperation2();
    }
}
