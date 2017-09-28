package com.lh.designmode.observer;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
