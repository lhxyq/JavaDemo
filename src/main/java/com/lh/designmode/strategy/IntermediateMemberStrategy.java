package com.lh.designmode.strategy;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return bookPrice * 0.9;
    }
}
