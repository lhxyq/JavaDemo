package com.lh.demo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by LH 2446059046@qq.com on 2017/9/5.
 */
public class MapDiff {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        map.put("name", "liuhui");

        new Thread(new Runnable() {
            @Override
            public void run() {
                map.put("name", "刘辉0");
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("线程0-name:" + map.get("name"));
            }
        }).start();

        new Thread(() -> {
            System.out.println("线程1-name:" + map.get("name"));
            map.put("name", "刘辉1");
        }).start();
    }
}
