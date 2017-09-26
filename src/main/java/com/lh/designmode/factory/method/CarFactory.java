package com.lh.designmode.factory.method;

/**
 * Created by LH 2446059046@qq.com on 2017/9/26.
 */
public class CarFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Car();
    }
}
