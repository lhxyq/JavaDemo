package com.lh.designmode.clone;

/**
 * Created by LH 2446059046@qq.com on 2017/9/29.
 */
public class ProtoType1 extends ProtoType {
    public int classFlag = 1;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (ProtoType1)super.clone();
    }
}
