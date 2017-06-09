package com.lh.demo.sort;

import java.util.Comparator;

/**
 * Created by LH 2446059046@qq.com on 2017/6/9.
 */
public class QuickSort<T> implements Sort<T> {
    @Override
    public void sort(T[] t, Comparator<T> comparator) {
        this.recurPartiton(t, 0, t.length - 1, comparator);
    }

    private void recurPartiton(T[] t, int start, int end, Comparator<T> comparator) {
        if (end - start < 1)
            return;

        int n = this.partition(t, start, end, comparator);

        if (start == n) {
            recurPartiton(t, start + 1, end, comparator);
        } else if (end == n) {
            recurPartiton(t, start, end - 1, comparator);
        } else {
            recurPartiton(t, start, n - 1, comparator);
            recurPartiton(t, n + 1, end, comparator);
        }
    }

    /**
     * 拆分数组
     *
     * @param t     要拆分的数组
     * @param start 起始索引
     * @param end   结束索引
     * @return 基准元素的位置
     */
    private int partition(T[] t, int start, int end, Comparator<T> comparator) {
        //选取基准元素，这里我们以最后一个位置，作为基准
        T base = t[end];

        //基准元素的预计位置，n=start表示的就是默认没有小于基准元素
        int n = start;

        //基准元素不参与遍历比较
        for (int i = start; i < end; i++) {
            if (comparator.compare(t[i], base) < 0) {
                if (i != n) {
                    this.exchangeArray(t, i, n);
                }
                n++;
            }
        }

        this.exchangeArray(t, n, end);

        return n;
    }

    /**
     * 交换数组中指定位置的两个元素
     *
     * @param t      要交换的数组
     * @param index0 位置0
     * @param index1 位置1
     */
    private void exchangeArray(T[] t, int index0, int index1) {
        if (index0 == index1)
            return;

        T tmp = t[index0];
        t[index0] = t[index1];
        t[index1] = tmp;
    }
}
