package final_exam.java1019;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerInnerEx extends JFrame {
    public ActionListenerInnerEx() {
        setTitle("ActionListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("action");
        btn.addActionListener(new L());

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(btn);

        setSize(350, 150);
        setVisible(true);
    }

    private class L implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();

            if (b.getText().equals("action")) {
                b.setText("액션");
            } else {
                b.setText("action");
            }

            ActionListenerInnerEx.this.setTitle(b.getText());
        }
    }

    public static void main(String[] args) {
        ActionListenerInnerEx e = new ActionListenerInnerEx();
    }
}
