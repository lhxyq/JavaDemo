package com.lh.demo.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by LH 2446059046@qq.com on 2017/8/31.
 */
public class FirstSwing {

    public static void createAndShowGUI() {
        JFrame jframe = new JFrame("FirstSwing");
//        jframe.setSize(500, 500);
        //全屏
        jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jframe.add(jPanel);

        placeComponents(jPanel, jframe);
        jframe.setVisible(true);
    }

    private static void placeComponents(JPanel jPanel, JFrame jFrame) {
        jPanel.setLayout(null);

        JLabel userLable = new JLabel("user:");
        userLable.setBounds(10, 20, 80, 25);
        jPanel.add(userLable);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        userText.setText("LH");
        jPanel.add(userText);

        JLabel passLabel = new JLabel("pass:");
        passLabel.setBounds(10, 50, 80, 25);
        jPanel.add(passLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        passwordText.setText("123456");
        jPanel.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        jPanel.add(loginButton);

        loginButton.setActionCommand(ButtonClickListener.SUBMIT_COMMAND);
//        loginButton.addActionListener(new ButtonClickListener(jFrame));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "是否显示密码", "密码", JOptionPane.YES_NO_OPTION);
                if (0 == result)
                    System.out.println(passwordText.getPassword());
                if (1 == result)
                    System.out.println("cant not show password....");

                Object[] options = {"确定", "取消", "帮助"};
                int respont = JOptionPane.showOptionDialog(null, "点击按钮看效果", "自定义", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null
                , options, options[0] );
                if (0 == respont)
                    System.out.println("comfirm");
            }
        });
    }
}
