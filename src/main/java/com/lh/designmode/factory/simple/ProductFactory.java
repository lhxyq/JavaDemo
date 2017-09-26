package com.lh.designmode.factory.simple;

/**
 * Created by LH 2446059046@qq.com on 2017/9/26.
 */
public class ProductFactory {
    public static Product getProduct(String key) {
        Product product;
        switch (key) {
            case "TV":
                product = new Tv();
                break;
            case "CAR":
                product = new Car();
                break;
            default:
                product = null;
                break;
        }

        return product;
    }
}
