package com.lyloou.headfirst.c11.virtual;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author lyloou
 * @date 2019/10/04 17:35
 */
public class LoadImageProxy implements Icon {
    private JLabel label;
    private URL url;
    private boolean retrieving = false;

    public LoadImageProxy(JLabel label, URL url) {
        this.url = url;
        this.label = label;
        label.setIcon(this);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("Loading CD cover", x + 300, y + 190);
        if (!retrieving) {
            retrieving = true;
            Thread retrievalThread = new Thread(() -> {
                ImageIcon icon = new ImageIcon(url, "CD Cover");
                label.setIcon(new NormalImageProxy(icon));
                label.repaint();
            });
            retrievalThread.start();
        }
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }
}
