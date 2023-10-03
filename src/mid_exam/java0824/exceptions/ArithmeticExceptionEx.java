package mid_exam.java0824.exceptions;

import java.util.Scanner;

public class ArithmeticExceptionEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("나뉠 수를 입력하세요: ");
            int divided = scanner.nextInt();

            System.out.print("나눌 수를 입력하세요: ");
            int divisor = scanner.nextInt();

            try {
                System.out.println(divided + "를 " + divisor + "로 나누면 몫은 " + divided / divisor + "입니다.");
                break;
            } catch(ArithmeticException err) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }
    }
}
