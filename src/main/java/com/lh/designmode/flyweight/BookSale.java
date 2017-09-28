package com.lh.designmode.flyweight;

/**
 * Created by LH 2446059046@qq.com on 2017/9/28.
 */
public class BookSale implements Sale {
    private String name;
    private double price;

    public BookSale(String name) {
        this.name = name;
    }

    @Override
    public void cell() {
        System.out.println("售书 书名:" + name + "\t价格:" + price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
