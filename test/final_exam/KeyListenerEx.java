package final_exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListenerEx extends JFrame {
    private JLabel[] keyMessage;

    public KeyListenerEx() {
        setTitle("KeyListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyListener());

        keyMessage = new JLabel[3];
        keyMessage[0] = new JLabel(" getKeyCode() ");
        keyMessage[1] = new JLabel(" getKeyChar() ");
        keyMessage[2] = new JLabel(" getKeyText() ");

        for (int i = 0; i < keyMessage.length; i++) {
            keyMessage[i].setOpaque(true);
            keyMessage[i].setBackground(Color.YELLOW);
            c.add(keyMessage[i]);
        }

        setSize(300, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();

        // here: `setVisible`은 포커싱을 임의로 움직이기 때문에 `setFocusable(true)` -> `requestFocus`로 포커스를 강제 지정한다.
        //  - keyListener를 content pane에 설정했으므로 포커스 지정 함수는 전부 content pane의 멤버
    }

    class MyKeyListener extends KeyAdapter {
        // here: KeyPressed -> (KeyTyped, Unicode 입력 아니면 생략됨) -> KeyReleased 순으로 콜됨

        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();

            keyMessage[0].setText(Integer.toString(e.getKeyCode()));
            keyMessage[1].setText(Character.toString(e.getKeyChar()));
            keyMessage[2].setText(KeyEvent.getKeyText(e.getKeyCode()));

            System.out.println("keyPressed");
        }

        public void keyTyped(KeyEvent e) {
            System.out.println("keyTyped");
        }

        public void keyReleased(KeyEvent e) {
            System.out.println("keyReleased");
        }
    }

    public static void main(String[] args) {
        new KeyListenerEx();
    }
}
