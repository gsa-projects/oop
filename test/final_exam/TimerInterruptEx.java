package final_exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TimerRunnable implements Runnable {
    private JLabel timerLabel;

    public TimerRunnable(JLabel timerLabel) {
        this.timerLabel = timerLabel;
    }

    public void run() {
        int n = 0;
        while (true) {
            timerLabel.setText(Integer.toString(n++));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class TimerInterruptEx extends JFrame {
    public TimerInterruptEx() {
        setTitle("Timer Runnable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel);

        TimerRunnable timer = new TimerRunnable(timerLabel);
        Thread th = new Thread(timer);

        JButton btn = new JButton("Kill");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                th.interrupt();
                JButton src = (JButton) e.getSource();
                src.setEnabled(false);
            }
        });
        c.add(btn);

        setSize(300, 170);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new TimerInterruptEx();
    }
}
