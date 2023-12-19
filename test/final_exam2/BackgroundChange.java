package final_exam2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BackgroundChange extends JFrame {  // here: extends JFrame 까먹음 주의
    JLabel label;

    public BackgroundChange() {
        setTitle("Background Change");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        label = new JLabel("Key");
        label.setFont(new Font("Gothic", Font.ITALIC, 30));

        c.add(label);
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '%')
                    c.setBackground(Color.YELLOW);
                else if (e.getKeyCode() == KeyEvent.VK_F5)  // here: elif ㅇㅈㄹ하지마라
                    c.setBackground(Color.GREEN);

                label.setText(KeyEvent.getKeyText(e.getKeyCode()));
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
