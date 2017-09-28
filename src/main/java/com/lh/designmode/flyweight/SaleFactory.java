package com.lh.designmode.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class SaleFactory {
    private static Map<String, Sale> saleMap = new HashMap<>();

    public static Sale getSale(String name) {
        Sale sale = saleMap.get(name);

        if (sale == null) {
            sale = new BookSale(name);
            saleMap.put(name, sale);
        }

        return sale;
    }

    public static int getSaleMapSize() {
        return saleMap.size();
    }
}
