package com.lyloou.headfirst.c2.shouldido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    private JFrame jFrame;

    public static void main(String[] args) {
        new SwingObserverExample().go();
    }

    public void go() {
        jFrame = new JFrame();
        jFrame.setSize(550, 550);
        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
        CardLayout manager = new CardLayout();
        manager.setHgap(123);
        manager.setVgap(123);
        jFrame.setLayout(manager);
        jFrame.setVisible(true);
    }

    private class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it");
        }
    }

    private class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}
