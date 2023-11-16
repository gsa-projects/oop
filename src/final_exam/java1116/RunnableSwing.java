package final_exam.java1116;

import javax.swing.*;
import java.awt.*;

class TimerRunnable implements Runnable {
    private JLabel label;

    public TimerRunnable(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        int n = 0;
        while (true) {
            this.label.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class RunnableSwing extends JFrame {
    public RunnableSwing() {
        setTitle("Thread를 상속받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setFont(new Font("Wanted Sans Variable", Font.ITALIC, 80));
        c.add(label);

        TimerRunnable run = new TimerRunnable(label);
        Thread th = new Thread(run);

        setSize(300, 170);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new RunnableSwing();
    }
}
