package com.lh.designmode.factory.method;

/**
 * Created by LH 2446059046@qq.com on 2017/9/26.
 */
public class Demo {
    public static void main(String[] args) {
        Factory factory = new TvFactory();
        Product product = factory.createProduct();
        System.out.println(product);

        factory = new CarFactory();
        product = factory.createProduct();
        System.out.println(product);
    }
}
