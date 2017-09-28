package com.lh.designmode.observer;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}
