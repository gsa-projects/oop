package final_exam3;

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
            label.setText(Integer.toString(n++));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
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

        JButton button = new JButton("Kill");
        JLabel label = new JLabel();
        TimerThread th = new TimerThread(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                th.interrupt();
                JButton btn = (JButton) e.getSource();
                btn.setEnabled(false);
            }
        });

        c.add(button);
        c.add(label);

        setSize(400, 200);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new KillTimer();
    }
}
