package ch3;

import java.util.Scanner;

class Example3_2 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        System.out.println("정수를 입력하고 마지막에 -1를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n != -1) {
            sum += n;
            count++;
            n = scanner.nextInt();
        }

        System.out.println("정수의 개수는 " + count + "개이며 평균은 " + (double)sum / count + "입니다.");
    }
}