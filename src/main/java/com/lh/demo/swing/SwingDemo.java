package com.lh.demo.swing;

import javax.swing.*;

/**
 * Created by LH 2446059046@qq.com on 2017/8/31.
 */
public class SwingDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FirstSwing.createAndShowGUI();
        });
    }
}
