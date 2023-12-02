package final_exam.java1106;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
    public TextFieldEx() {
        setTitle("텍스트 필드 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("이름 "));
        c.add(new JTextField(20));
        c.add(new JLabel("학과 "));

        JTextField field = new JTextField("컴퓨터공학과 ", 20);
        field.addActionListener(e -> {
            System.out.println(((JTextField) e.getSource()).getText());
        });

        c.add(field);
        c.add(new JLabel("주소 "));
        c.add(new JTextField("서울시 ...", 20));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldEx();
    }
}
