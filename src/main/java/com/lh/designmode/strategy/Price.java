package com.lh.designmode.strategy;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class Price {
    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    public double quote(double price) {
        return this.memberStrategy.calcPrice(price);
    }
}
