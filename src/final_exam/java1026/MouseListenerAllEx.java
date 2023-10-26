package final_exam.java1026;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListenerAllEx extends JFrame {
    private final JLabel label = new JLabel("No Mouse Event");

    public MouseListenerAllEx() {
        setTitle("MouseListener & MouseMotionListener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);
        c.add(label);

        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {
        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {
            label.setText("mousePressed ("+e.getX()+", "+e.getY()+")");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            label.setText("mouseReleased ("+e.getX()+", "+e.getY()+")");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            label.setText("mouseMoved ("+e.getX()+", "+e.getY()+")");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            label.setText("mouseDragged ("+e.getX()+", "+e.getY()+")");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            Component c = getContentPane();
            c.setBackground(Color.CYAN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            Component c = getContentPane();
            c.setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] args) {
        new MouseListenerAllEx();
    }
}
