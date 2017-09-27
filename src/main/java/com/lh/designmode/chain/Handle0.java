package com.lh.designmode.chain;

/**
 * Created by LH 2446059046@qq.com on 2017/9/27.
 */
public class Handle0 extends Handel {
    @Override
    public Level getHandleLevel() {
        return new Level(0);
    }

    @Override
    public void response(Request request) {
        System.out.println("请求由处理器0处理...");
    }
}
