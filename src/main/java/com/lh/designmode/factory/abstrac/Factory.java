package com.lh.designmode.factory.abstrac;

/**
 * Created by LH 2446059046@qq.com on 2017/9/26.
 */
public class Factory implements IFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }

    @Override
    public Tv createTv() {
        return new LeTv();
    }
}
