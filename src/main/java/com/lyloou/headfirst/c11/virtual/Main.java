package com.lyloou.headfirst.c11.virtual;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

/**
 * @author lyloou
 * @date 2019/10/04 17:40
 */
public class Main {
    private JFrame frame = new JFrame("CD Cover Viewer");

    @SuppressWarnings("unchecked")
    private Hashtable<String, String> cds = new Hashtable() {{
        put("oliver", "http://www.cs.yale.edu/homes/freeman-elisabeth/2004/9/Oliver_sm.jpg");
    }};
    private JLabel comp;

    public static void main(String[] args) throws MalformedURLException {
        new Main();
    }


    public Main() throws MalformedURLException {
        initView();
    }

    private void initView() throws MalformedURLException {
        URL initialUrl = new URL(cds.get("oliver"));
//        comp = new JLabel(new ImageProxy(initialUrl));
        comp = new JLabel();
        new LoadImageProxy(comp, initialUrl);
        frame.getContentPane().add(comp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }


}
