package mid_exam.java0821.problems;

import java.util.Scanner;

// p.110 - 4
public class Problem1 {
    public static void main(String[] args) {
        System.out.print("정수 3개 입력 >>");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // a > b > c 으로 sort
        for (int i = 0; i < 3; i++) {
            if (a < b) {
                int tmp = a;
                a = b;
                b = tmp;
            }

            if (b < c) {
                int tmp = b;
                b = c;
                c = tmp;
            }
        }

        System.out.println(b);
    }
}
