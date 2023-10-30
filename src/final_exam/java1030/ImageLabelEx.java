package final_exam.java1030;

import javax.swing.*;
import java.awt.*;

public class ImageLabelEx extends JFrame {
    public ImageLabelEx() {
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel txtLabel = new JLabel("배");

        ImageIcon pear = new ImageIcon("images/beauty.jpg");
        JLabel imgLabel = new JLabel(pear);

        ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
        JLabel iconLabel = new JLabel("tel", normalIcon, SwingConstants.CENTER);

        c.add(txtLabel);
        c.add(imgLabel);
        c.add(iconLabel);

        setSize(400, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageLabelEx();
    }
}
