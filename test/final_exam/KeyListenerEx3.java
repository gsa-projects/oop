package final_exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KeyListenerEx3 extends JFrame {
    private JLabel label = new JLabel("HELLO");

    public KeyListenerEx3() {
        setTitle("KeyCode 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        label.setLocation(50, 50);
        label.setSize(100, 20);
        c.add(label);

        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int x = label.getX();
                int y = label.getY();

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        label.setLocation(x - 10, y);
                        break;
                    case KeyEvent.VK_RIGHT:
                        label.setLocation(x + 10, y);
                        break;
                    case KeyEvent.VK_UP:
                        label.setLocation(x, y - 10);
                        break;
                    case KeyEvent.VK_DOWN:
                        label.setLocation(x, y + 10);
                        break;
                }
            }
        });

        // here: 여기는 클릭하면 포커스 하게 만드는 방법
        c.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Component com = (Component) e.getSource();

                com.setFocusable(true);
                com.requestFocus();
            }
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyListenerEx3();
    }
}
