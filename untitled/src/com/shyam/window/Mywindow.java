package com.shyam.window;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Mywindow extends Frame {

    public Mywindow(String title){
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif",Font.BOLD,18);
        Font sansSerifSmall = new Font("SansSerif",Font.BOLD,12);
        g.setFont(sansSerifLarge);
        g.drawString("Shyam Developed this",60,60);
        g.setFont(sansSerifSmall);
        g.drawString("this is shyam",60,100);
    }
}
