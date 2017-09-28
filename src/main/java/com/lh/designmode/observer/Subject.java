package com.lh.designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        if (this.state != state) {
            this.state = state;
            notifyAllObserver();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObserver() {
        observers.forEach(e -> {
            e.update();
        });
    }
}
