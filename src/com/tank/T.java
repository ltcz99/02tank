package com.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author litao
 * @date 2020-05-21
 */
public class T extends Frame {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //设置窗口的尺寸
        frame.setSize(800,600);
        //参数设置为true，当程序运行时，窗口显示
        frame.setVisible(true);
        //设置窗口标题
        frame.setTitle("Tank war");
        //点击窗口X关闭窗口,添加监听事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
