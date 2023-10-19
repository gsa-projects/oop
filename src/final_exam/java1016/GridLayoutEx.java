package final_exam.java1016;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        GridLayout layout = new GridLayout(4, 2, 0, 5);
        layout.setVgap(5);

        c.setLayout(layout);
        c.add(new JLabel(" 이름"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학번"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학과"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 과목"));
        c.add(new JTextField(""));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        GridLayoutEx grid = new GridLayoutEx();
    }
}
