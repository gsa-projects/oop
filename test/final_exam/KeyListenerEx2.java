package final_exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListenerEx2 extends JFrame {
    private JLabel label = new JLabel();

    public KeyListenerEx2() {
        setTitle("KeyCode 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.add(label);
        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Container contentPane = (Container) e.getSource();

                label.setText(KeyEvent.getKeyText(e.getKeyCode()) + label.getText());

                // F1키를 입력하면 초록색, %키를 입력하면 노란색
                if (e.getKeyChar() == '%')
                    contentPane.setBackground(Color.YELLOW);
                else if (e.getKeyCode() == KeyEvent.VK_F5)
                    contentPane.setBackground(Color.GREEN);
            }
        });

        setSize(300, 100);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    public static void main(String[] args) {
        new KeyListenerEx2();
    }
}
