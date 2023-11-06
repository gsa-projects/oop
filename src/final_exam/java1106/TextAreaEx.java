package final_exam.java1106;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaEx extends JFrame {
    private final JLabel label = new JLabel("입력 후 <Enter> 키를 입력하세요");
    private final JTextField textField = new JTextField(20);
    private final JTextArea textArea = new JTextArea(7, 20);

    public TextAreaEx() {
        setTitle("텍스트 영역 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(label);
        c.add(textField);
        c.add(textArea);

        // JTextField는 enter를 누르면 자동으로 ActionListener가 호출되나봄
        // todo: 다른 키를 눌러도 되도록?
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField) e.getSource();

                textArea.append(t.getText() + "\n");
                t.setText("");
            }
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaEx();
    }
}
