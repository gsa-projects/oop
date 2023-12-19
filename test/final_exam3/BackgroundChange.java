package final_exam3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BackgroundChange extends JFrame {
    public BackgroundChange() {
        setTitle("Background Change");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel("Action");
        c.add(label);

        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                label.setText(KeyEvent.getKeyText(e.getKeyCode()));

                if (e.getKeyChar() == '%') {
                    c.setBackground(Color.YELLOW);
                } else if (e.getKeyCode() == KeyEvent.VK_F5) {
                    c.setBackground(Color.GREEN);
                }

                setTitle(label.getText());
            }
        });

        setSize(300, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    public static void main(String[] args) {
        new BackgroundChange();
    }
}
