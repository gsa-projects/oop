package final_exam.java1030;

import javax.swing.*;
import java.awt.*;

public class ImageButtonEx extends JFrame {
    public ImageButtonEx() {
        setTitle("이미지 버튼");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon normal = new ImageIcon("images/normalIcon.gif");
        ImageIcon rollover = new ImageIcon("images/rolloverIcon.gif");
        ImageIcon pressed = new ImageIcon("images/pressedIcon.gif");

        // 이렇게 해도 됨
        // JButton btn = new JButton("tel");
        // btn.setIcon(normal);
        JButton btn = new JButton("tel", normal);
        btn.setRolloverIcon(rollover);
        btn.setPressedIcon(pressed);

        c.add(btn);

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageButtonEx();
    }
}
