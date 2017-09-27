package com.lh.designmode.chain;

/**
 * Created by LH 2446059046@qq.com on 2017/9/27.
 */
public class Demo {
    public static void main(String[] args) {
        Handel handel0 = new Handle0();
        Handel handel1 = new Handle1();
        Handel handel2 = new Handle2();

        Request request = new Request(new Level(3));

        handel0.setNextHandel(handel1);
        handel1.setNextHandel(handel2);

        handel0.handleRequest(request);
    }
}
