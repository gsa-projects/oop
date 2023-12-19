package final_exam2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TimerThread extends Thread {
    private JLabel label;

    public TimerThread(JLabel label) {
        this.label = label;
    }

    public void run() {
        int n = 0;
        while (true) {
            try {
                label.setText(Integer.toString(n++));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

public class KillTimer extends JFrame {
    public KillTimer() {
        setTitle("Kill Timer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setFont(new Font("Archivo", Font.ITALIC, 100));
        c.add(label);

        TimerThread th = new TimerThread(label);

        JButton btn = new JButton("Kill");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 th.interrupt();

                 JButton src = (JButton) e.getSource();
                 src.setEnabled(false);
            }
        });
        c.add(btn);     // here: 이거 빼먹음

        setSize(300, 150);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new KillTimer();
    }
}
