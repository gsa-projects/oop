package final_exam.java1019;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TextMove extends JFrame {
    private final int step = 10;
    private final JLabel label;

    TextMove() {
        setTitle("Text Move Project");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        label = new JLabel("Text");
        label.setLocation(50, 50);
        label.setSize(100, 20);
        c.addKeyListener(new TextKeyListener());
        c.add(label);

        setSize(300, 250);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    private class TextKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
//            JLabel label = (JLabel) e.getSource();

            int x = label.getX();
            int y = label.getY();

            switch (code) {
                case KeyEvent.VK_UP -> label.setLocation(x, y - step);
                case KeyEvent.VK_DOWN -> label.setLocation(x, y + step);
                case KeyEvent.VK_LEFT -> label.setLocation(x - step, y);
                case KeyEvent.VK_RIGHT -> label.setLocation(x + step, y);
            }
        }
    }

    public static void main(String[] args) {
        new TextMove();
    }
}
