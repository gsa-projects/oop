package final_exam.java1120;

public class ThreadMainEx {
    public static void main(String[] args) {
        long id = Thread.currentThread().getId();
        System.out.println("id = " + id);
        String name = Thread.currentThread().getName();
        System.out.println("name = " + name);
        int prior = Thread.currentThread().getPriority();
        System.out.println("prior = " + prior);
        Thread.State s = Thread.currentThread().getState();
        System.out.println("s = " + s);
    }
}
