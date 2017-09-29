package com.lh.designmode.clone;

/**
 * Created by LH 2446059046@qq.com on 2017/9/29.
 */
public abstract class ProtoType implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
