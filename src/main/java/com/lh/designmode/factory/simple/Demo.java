package com.lh.designmode.factory.simple;

/**
 * Created by LH 2446059046@qq.com on 2017/9/26.
 */
public class Demo {
    public static void main(String[] args) {
        Product product = ProductFactory.getProduct("TV");
        System.out.println(product);
    }
}
