package final_exam.java1012;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        //  super("ContentPane과 JFrame");    // 같은 기능

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 끄면 실행도 종료

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());    // 배치 관리자, 가로로 배치되는.

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        ContentPaneEx frame = new ContentPaneEx();
    }
}
