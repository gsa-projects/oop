package final_exam.java1016;

import javax.swing.*;
import java.awt.*;

public class NoLayoutEx extends JFrame {
    public NoLayoutEx() {
        setTitle("NoLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel label = new JLabel("Hello, Press Buttons!");
        label.setLocation(130, 50);
        label.setSize(200, 20);
        c.add(label);

        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(Integer.toString(i));
//            button.setLocation(i*15, i*15);
            button.setLocation(50, 50);
            button.setSize(50, 20);
            c.add(button);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        NoLayoutEx no = new NoLayoutEx();
    }
}
