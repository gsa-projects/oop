package final_exam2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TimerTh extends Thread {
    private JLabel label;
    private int n = 0;
    private boolean flag = false;

    public void finish() {
        flag = true;
    }

    public TimerTh(JLabel label) {
        this.label = label;
    }

    public void run() {
        while (true) {
            label.setText(Integer.toString(n));
            n++;

            try {
                sleep(1000);
                if (flag == true)
                    return;
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class KillTimer3 extends JFrame {
    public KillTimer3() {
        setTitle("Kill Timer 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setFont(new Font("Archivo", Font.ITALIC, 80));
        c.add(label);

        TimerTh th = new TimerTh(label);

        JButton btn = new JButton("Kill");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                th.finish();
                JButton src = (JButton) e.getSource();
                src.setEnabled(false);
            }
        });
        c.add(btn);

        setSize(300, 150);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new KillTimer3();
    }
}
