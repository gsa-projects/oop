package mid_exam.java0824.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 3개를 입력하세요");
        int sum = 0, n;

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " >> ");

            try {
                n = scanner.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("정수가 아닙니다. 다시 입력하세요.");

                scanner.next();
                i--;
                continue;
            }

            sum += n;
        }

        System.out.println("합은 " + sum);
    }
}
