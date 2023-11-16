package final_exam.java1116;

import javax.swing.*;
import java.awt.*;

class TimerThread2 extends Thread {
    private JLabel label;

    public TimerThread2(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        int n = 0;
        while (true) {
            this.label.setText(Integer.toString(n));
            n++;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class TimerThreadSwing extends JFrame {
    public TimerThreadSwing() {
        setTitle("Thread를 상속받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        label.setFont(new Font("Wanted Sans Variable", Font.ITALIC, 80));
        c.add(label);

        TimerThread2 th = new TimerThread2(label);

        setSize(300, 170);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new TimerThreadSwing();
    }
}
