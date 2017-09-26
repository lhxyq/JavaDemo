package com.lh.designmode.factory.abstrac;

/**
 * Created by LH 2446059046@qq.com on 2017/9/26.
 */
public class Demo {
    public static void main(String[] args) {
        IFactory iFactory = new Factory();
        Car car = iFactory.createCar();
        Tv tv = iFactory.createTv();
    }
}
