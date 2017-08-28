package com.lh.demo.async;

import java.util.concurrent.*;

/**
 * Created by LH 2446059046@qq.com on 2017/8/28.
 */
public class Asynchronous {
    private final static long count = 1000000000;

    public static void main(String[] args) {
        Asynchronous a = new Asynchronous();
        a.async();
        a.sync();
    }

    public void async() {
        long start = System.currentTimeMillis();
        long b = 0;
        long a = 0;

        ExecutorService es = Executors.newFixedThreadPool(2);

        FutureTask<Long> futureTask = new FutureTask<Long>(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                long a = 0;
                for (long i = 1; i <= count; i++) {
                    a += 5;
                }
                return a;
            }
        });
        es.submit(futureTask);

        for (long i = 1; i <= count; i++)
            b -= 5;

        try {
            a = futureTask.get();
            System.out.println("async time:" + (System.currentTimeMillis() - start) + "\ta=" + a + "\tb=" + b);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();
    }

    public void sync() {
        long start = System.currentTimeMillis();
        long a = 0;
        long b = 0;

        for (long i = 1; i <= count; i++) {
            a += 5;
        }

        for (long i = 1; i <= count; i++)
            b -= 5;

        System.out.println("sync time:" + (System.currentTimeMillis() - start) + "\ta=" + a + "\tb=" + b);
    }
}
