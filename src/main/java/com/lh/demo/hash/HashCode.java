package com.lh.demo.hash;

import java.lang.ref.SoftReference;


/**
 * Created by LH 2446059046@qq.com on 2017/9/7.
 */
public class HashCode {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof HashCode)) return false;

        HashCode hashCode = (HashCode) o;

        return this.i == hashCode.i;
    }

    @Override
    public int hashCode() {
        return i % 10;
    }

    public void recursivePrint (int num) {
        System.out.println("Num:" + num);
        if (0 == num)
            return;
        else
            recursivePrint(++num);
    }

    public static void main(String[] args) throws InterruptedException{
        HashCode hashCode = new HashCode();
        hashCode.setI(10);
        SoftReference<HashCode> weakReference = new SoftReference<HashCode>(hashCode);
        hashCode = null;
        System.out.println("回收前:" + weakReference.get().getI());
        System.gc();
        Thread.currentThread().sleep(5000);

        System.out.println("回收后:" + weakReference.get().getI());
//        hashCode.recursivePrint(1);
    }
}
