package final_exam.java1030;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComponentEx extends JFrame {
    public JComponentEx() {
        super("JComponent의 공통 메소드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton btn1 = new JButton("Magenta/Yellow Button");
        JButton btn2 = new JButton(" Disabled Button ");
        JButton btn3 = new JButton("getX(), getY()");

        btn1.setBackground(Color.YELLOW);
        btn1.setForeground(Color.MAGENTA);
        btn1.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 20));

        btn2.setEnabled(false);

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                JComponentEx frame = (JComponentEx) b.getTopLevelAncestor();

                frame.setTitle(b.getX() + "," + b.getY());
            }
        });

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);

        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComponentEx();
    }
}
