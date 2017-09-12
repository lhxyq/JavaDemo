package com.lh.demo.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by LH 2446059046@qq.com on 2017/8/31.
 */
public class ButtonClickListener implements ActionListener {
    public static final String SUBMIT_COMMAND = "submit";

    private JFrame jFrame;

    public ButtonClickListener(JFrame jFrame) {
        this.jFrame = jFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (SUBMIT_COMMAND.equals(command)) {
            jFrame.dispose();//销毁窗体
            JFrame newFram = new JFrame("SecondSwing");
            newFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            newFram.setSize(500, 500);
            JLabel jLabel = new JLabel("second");
            newFram.setVisible(true);
            newFram.add(jLabel);
        }

    }
}
