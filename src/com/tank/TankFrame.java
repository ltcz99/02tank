package com.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author litao
 * @date 2020-05-21
 */
public class TankFrame extends Frame {
    public TankFrame(){
        //设置窗口的尺寸
        this.setSize(800,600);
        //设置窗口位置
        this.setLocation(500,200);
        //参数设置为true，当程序运行时，窗口显示
        this.setVisible(true);
        //设置窗口标题
        this.setTitle("Tank war");
        //点击窗口X关闭窗口,添加监听事件
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    /**
     * 重写paint方法，然后在窗口中指定位置画出一个矩形
     * @param g
     */
    @Override
    public void paint(Graphics g){
        g.fillRect(200,200,25,25);
    }
}
