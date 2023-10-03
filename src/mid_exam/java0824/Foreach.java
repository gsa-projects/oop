package mid_exam.java0824;

public class Foreach {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int e : array) {
            sum += e;
        }
        System.out.print("합계는 " + sum);
    }
}
