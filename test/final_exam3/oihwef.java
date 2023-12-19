package final_exam3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class oihwef {
    public static void main(String[] args) {
        JButton btn = new JButton();

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btn.getText().equals("Action"))
                    btn.setText("Button");
                else
                    btn.setText("Action");
                setTitle(btn.getText())
        }});
    }
}
