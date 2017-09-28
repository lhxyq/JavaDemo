package com.lh.designmode.strategy;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return bookPrice * 0.8;
    }
}
