package mid_exam.java0821;

import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while (true) {
            int n = scanner.nextInt();
            if (n == -1) break;

            sum += n;
            count++;
        }

        if (count == 0) {
            System.out.println("입력된 수가 없습니다.");
        } else {
            System.out.print("정수의 개수는 " + count + "개이며 ");
            System.out.println("평균은 " + (double)sum/count + "입니다.");
        }
    }
}
