package final_exam2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WhichKeyPressed extends JFrame {
    JLabel l1, l2, l3;

    public WhichKeyPressed() {
        setTitle("Which Key Pressed");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        l1 = new JLabel("getKeyCode");
        l1.setOpaque(true);
        l1.setBackground(Color.YELLOW);

        l2 = new JLabel("getKeyChar");
        l2.setOpaque(true);
        l2.setBackground(Color.YELLOW);

        l3 = new JLabel("getKeyText");
        l3.setOpaque(true);
        l3.setBackground(Color.YELLOW);

        c.add(l1);
        c.add(l2);
        c.add(l3);

        c.addKeyListener(new MyKeyListener());

        setSize(300, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            char ch = e.getKeyChar();
            String txt = KeyEvent.getKeyText(code);

            l1.setText(Integer.toString(code));
            l2.setText(Character.toString(ch));
            l3.setText(txt);
        }
    }

    public static void main(String[] args) {
        new WhichKeyPressed();
    }
}
