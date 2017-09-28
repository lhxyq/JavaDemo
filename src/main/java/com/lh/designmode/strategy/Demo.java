package com.lh.designmode.strategy;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class Demo {
    public static void main(String[] args) {
        Price price = new Price(new IntermediateMemberStrategy());

        double quote = price.quote(300);

        System.out.println("图书的最终价格为：" + quote);
    }
}
