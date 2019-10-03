package com.lyloou.headfirst.c8;

import javax.swing.*;
import java.awt.*;

/**
 * @author lyloou
 * @date 2019/10/03 11:43
 */
public class MyFrame extends JFrame {
    private String title;

    public static void main(String[] args) {
        new MyFrame("Head First Design Pattern");
    }

    public MyFrame(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.title = title;
        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("I rule!!", 100, 100);
    }
}
