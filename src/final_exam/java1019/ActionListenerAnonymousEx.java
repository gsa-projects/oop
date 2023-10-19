package final_exam.java1019;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerAnonymousEx extends JFrame {
    public ActionListenerAnonymousEx() {
        setTitle("ActionListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("action");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();

                if (b.getText().equals("action")) {
                    b.setText("액션");
                } else {
                    b.setText("action");
                }

                setTitle(b.getText());
            }
        });

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(btn);

        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        ActionListenerAnonymousEx e = new ActionListenerAnonymousEx();
    }
}
