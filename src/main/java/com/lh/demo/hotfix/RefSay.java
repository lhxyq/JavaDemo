package com.lh.demo.hotfix;

/**
 * Created by LH 2446059046@qq.com on 2017/9/11.
 */
public class RefSay implements Say {
    public RefSay() {

    }

    @Override
    public void say() {
        System.out.println("我是MD的大爷");
    }
}
