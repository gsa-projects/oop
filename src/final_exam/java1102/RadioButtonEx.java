package final_exam.java1102;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
    public RadioButtonEx() {
        setTitle("라디오 버튼 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
        ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");

        ButtonGroup g = new ButtonGroup();
        ButtonGroup g2 = new ButtonGroup();

        JRadioButton apple = new JRadioButton("사과");
        JRadioButton pear = new JRadioButton("배", true);
        JRadioButton cherry = new JRadioButton("체리", cherryIcon);
        JRadioButton moon = new JRadioButton("문");
        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selectedCherryIcon);

        g.add(apple);
        g.add(pear);

        g2.add(cherry);
        g2.add(moon);

        c.add(apple);
        c.add(pear);
        c.add(cherry);
        c.add(moon);

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonEx();
    }
}
