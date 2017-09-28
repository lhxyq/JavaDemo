package com.lh.designmode.observer;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
