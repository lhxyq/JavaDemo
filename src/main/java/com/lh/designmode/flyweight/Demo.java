package com.lh.designmode.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class Demo {
    public static void main(String[] args) {
        List<Sale> sales = new ArrayList<>();
        sales.add(SaleFactory.getSale("三国演义"));
        sales.add(SaleFactory.getSale("水浒传"));
        sales.add(SaleFactory.getSale("封神榜"));
        sales.add(SaleFactory.getSale("三体"));
        sales.add(SaleFactory.getSale("红楼梦"));
        sales.add(SaleFactory.getSale("封神榜"));
        sales.add(SaleFactory.getSale("水浒传"));

        sales.forEach(e -> {
            e.cell();
        });

        System.out.println("客户一共买了" + sales.size() + "本书");
        System.out.println("一共生成了" + SaleFactory.getSaleMapSize() + "个对象");
    }
}
