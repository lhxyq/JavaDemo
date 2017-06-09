package com.lh.demo.sort;

import java.util.Comparator;

/**
 * Created by LH 2446059046@qq.com on 2017/6/9.
 */
public interface Sort<T> {
    void sort(T[] t, Comparator<T> comparator);
}
