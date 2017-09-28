package com.lh.designmode.observer;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state change: 10");
        subject.setState(10);

        System.out.println("Third state change: 10");
        subject.setState(10);
    }
}
