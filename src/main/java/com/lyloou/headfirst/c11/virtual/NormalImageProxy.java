package com.lyloou.headfirst.c11.virtual;

import javax.swing.*;
import java.awt.*;

/**
 * @author lyloou
 * @date 2019/10/04 17:35
 */
public class NormalImageProxy implements Icon {
    private ImageIcon imageIcon;

    public NormalImageProxy(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageIcon.paintIcon(c, g, (800 - getIconWidth()) / 2, (600 - getIconHeight()) / 2);
    }

    @Override
    public int getIconWidth() {
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon.getIconHeight();
    }
}
