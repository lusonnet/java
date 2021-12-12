package com.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-12-12
 * Time: 21:15
 */
public class TestDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button();
        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);

        frame.add(button,BorderLayout.CENTER);
        frame.pack();
        windowClose(frame);
        frame.setVisible(true);
    }

    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("aaa");
    }
}
