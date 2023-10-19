package final_exam.java1019;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerEx extends JFrame {
    private final JLabel[] keyMessages;
    Container c = getContentPane();

    KeyListenerEx() {
        setTitle("KeyListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyListener());
        c.setBackground(Color.CYAN);

        keyMessages = new JLabel[3];
        String[] texts = {"getKeyCode(): ", "getKeyChar(): ", "getKeyText(): "};
        for (int i = 0; i < keyMessages.length; i++) {
            keyMessages[i] = new JLabel(texts[i]);
            keyMessages[i].setOpaque(true); // note: opaque는 불투명하다는 뜻
            keyMessages[i].setBackground(Color.YELLOW);
            c.add(keyMessages[i]);
        }

        setSize(300, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    private class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            // note: '%'를 입력하면, keyChar는 '%' 를 입력하는데, keyText는 '5' 가 나옴. keyText는 말 그대로 입력한 키의 이름.
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();
            String keyText = KeyEvent.getKeyText(keyCode);  // note: static이라 이렇게 쓰지만, e.getKeyText(keyCode) 처럼 쓸 수도 있는거 잊지마

//            Container c = getContentPane();
            if (keyCode == KeyEvent.VK_F1) {
                c.setBackground(Color.GREEN);
            }
            else if (keyChar == '%') {
                System.out.println("[" + keyText + "]");
                c.setBackground(Color.YELLOW);
            }

            keyMessages[0].setText(Integer.toString(keyCode));
            keyMessages[1].setText(Character.toString(keyChar));
            keyMessages[2].setText(keyText);
        }
    }

    public static void main(String[] args) {
        new KeyListenerEx();
    }
}
