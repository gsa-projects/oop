package final_exam2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.StringTokenizer;

public class TextMoving extends JFrame {
    public TextMoving() {
        setTitle("Text Moving");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel label = new JLabel("Hello");
        label.setFont(new Font("Archivo", Font.BOLD | Font.ITALIC, 20));
        label.setSize(100, 20);
        label.setLocation(100, 100);
        c.add(label);

        c.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Container c = (Container) e.getSource();

                c.setFocusable(true);
                c.requestFocus();
            }
        });

        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int x = label.getX();
                int y = label.getY();

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP -> label.setLocation(x, y - 10);
                    case KeyEvent.VK_DOWN -> label.setLocation(x, y + 10);
                    case KeyEvent.VK_LEFT -> label.setLocation(x - 10, y);
                    case KeyEvent.VK_RIGHT -> label.setLocation(x + 10, y);
                }
            }
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextMoving();
    }
}
