package main.java.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Genius Doan on 4/12/2017.
 */
public class CheckInListPanel extends JPanel {

    private int width, height;
    private OnClickListener mListener;

    public CheckInListPanel(int x, int y, int width, int height)
    {
        super();

        this.width = width;
        this.height = height;

        setBounds(x,y, width, height);
        setBackground(Color.WHITE);
        setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
