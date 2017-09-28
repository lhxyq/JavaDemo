package com.lh.designmode.strategy;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("对于初级会员没有折扣");
        return bookPrice;
    }
}
