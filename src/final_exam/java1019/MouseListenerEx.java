package final_exam.java1019;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEx extends JFrame {
    private final JLabel label = new JLabel("Hello");

    MouseListenerEx() {
        setTitle("Mouse Event Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);
        c.addMouseListener(new MyMouseListener());

        label.setSize(50, 20);
        label.setLocation(30, 30);

        c.add(label);

        setSize(250, 250);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            label.setLocation(x, y);
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}
