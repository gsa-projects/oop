package final_exam2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TimerRunnable implements Runnable {
    private JLabel label;

    public TimerRunnable(JLabel label) {
        this.label = label;
    }

    public void run() {
        int n = 0;
        while (true) {
            label.setText(Integer.toString(n++));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

public class KillTimer2 extends JFrame {
    public KillTimer2() {
        setTitle("Kill Timer 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setFont(new Font("Archivo", Font.ITALIC, 80));
        c.add(label);

        TimerRunnable runnable = new TimerRunnable(label);
        Thread th = new Thread(runnable);

        JButton btn = new JButton("Kill");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                th.interrupt();
                JButton src = (JButton) e.getSource();
                src.setEnabled(false);
            }
        });
        c.add(btn);

        setSize(300, 150);
        setVisible(true);

        th.start();     // here: 이거 빼먹음
    }

    public static void main(String[] args) {
        new KillTimer2();
    }
}
