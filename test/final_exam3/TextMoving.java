package final_exam3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TextMoving extends JFrame {
    public TextMoving() {
        setTitle("Text Moving");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel label = new JLabel("Hello");
        label.setLocation(100, 100);
        label.setSize(100, 20);
        label.setFont(new Font("Gothic", Font.BOLD, 20));
        c.add(label);

        setSize(400, 400);
        setVisible(true);

        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();
                int x = label.getX();
                int y = label.getY();

                switch (code) {
                    case KeyEvent.VK_UP -> label.setLocation(x, y - 1);
                    case KeyEvent.VK_DOWN -> label.setLocation(x, y + 1);
                    case KeyEvent.VK_LEFT -> label.setLocation(x - 1, y);
                    case KeyEvent.VK_RIGHT -> label.setLocation(x + 1, y);
                }
            }
        });

        c.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Container contentPane = (Container) e.getSource();
                contentPane.setFocusable(true);
                contentPane.requestFocus();
            }
        });
    }

    public static void main(String[] args) {
        new TextMoving();
    }
}
