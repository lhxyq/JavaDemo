package com.lh.designmode.clone;

/**
 * Created by LH 2446059046@qq.com on 2017/9/29.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        ProtoType protoType = new ProtoType0();
        ProtoType0 t0 = (ProtoType0)protoType.clone();
        System.out.println(t0.classFlag);

        protoType = new ProtoType1();
        ProtoType1 t1 = (ProtoType1)protoType.clone();
        System.out.println(t1.classFlag);
    }
}
