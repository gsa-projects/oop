package final_exam.java1116;

class TimerThread extends Thread {
    int n = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println(n);
            n++;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class TimerThreadEx {
    public static void main(String[] args) {
        TimerThread th = new TimerThread();
        th.start();
    }
}
