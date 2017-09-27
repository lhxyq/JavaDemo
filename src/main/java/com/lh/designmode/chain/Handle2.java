package com.lh.designmode.chain;

/**
 * Created by LH 2446059046@qq.com on 2017/9/27.
 */
public class Handle2 extends Handel {
    @Override
    public Level getHandleLevel() {
        return new Level(2);
    }

    @Override
    public void response(Request request) {
        System.out.println("请求由处理器2处理...");
    }
}
