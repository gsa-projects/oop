package final_exam2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabAndButton extends JFrame {
    public TabAndButton() {
        setTitle("Tab And Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton btn = new JButton("액션");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton src = (JButton) e.getSource();

                if (src.getText().equals("액션")) {
                    src.setText("Action");
                } else {
                    src.setText("액션");
                }

                // here: c.setName(src.getText()); 이딴 야랄 했다가 틀림
                setTitle(src.getText());
            }
        });
        c.add(btn);     // here: 이거 빼먹음

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabAndButton();
    }
}
