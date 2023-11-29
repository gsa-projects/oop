package final_exam.java1120;

class SharedBoard {
    private int sum = 0;

    synchronized public void addSync() {
        int n = sum;
        Thread.yield();
        n += 10;
        sum = n;
        System.out.println(Thread.currentThread().getName() + " : " + sum);
    }

    public void add() {
        int n = sum;
        Thread.yield();
        n += 10;
        sum = n;
        System.out.println(Thread.currentThread().getName() + " : " + sum);
    }

    public int getSum() {
        return sum;
    }
}

class StudentThread extends Thread {
    private SharedBoard board;
    public StudentThread(String name, SharedBoard board) {
        super(name);
        this.board = board;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            board.add();
            //kkm : 20
            //kkm : 30
            //kkm : 40
            //kkm : 50
            //kkm : 60
            //kkm : 70
            //kkm : 80
            //kkm : 90
            //rhs : 10
            //kkm : 100
            //rhs : 110
            //kkm : 120
            //rhs : 130
            //rhs : 140
            //rhs : 150
            //rhs : 160
            //rhs : 170
            //rhs : 180
            //rhs : 190
            //rhs : 200

            board.addSync();
            //rhs : 10
            //rhs : 20
            //rhs : 30
            //rhs : 40
            //rhs : 50
            //rhs : 60
            //rhs : 70
            //rhs : 80
            //rhs : 90
            //rhs : 100
            //kkm : 110
            //kkm : 120
            //kkm : 130
            //kkm : 140
            //kkm : 150
            //kkm : 160
            //kkm : 170
            //kkm : 180
            //kkm : 190
            //kkm : 200
        }
    }
}

public class SynchronizedEx {
    public static void main(String[] args) {
        SharedBoard board = new SharedBoard();
        Thread th1 = new StudentThread("rhs", board);
        Thread th2 = new StudentThread("kkm", board);
        th1.start();
        th2.start();
    }
}
