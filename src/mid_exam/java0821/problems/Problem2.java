package mid_exam.java0821.problems;

import java.util.Scanner;

// p.111 - 6
public class Problem2 {
    public static void main(String[] args) {
        System.out.print("1~99 사이의 정수를 입력하세요>>");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int a = number / 10;
        int b = number % 10;

        if (!(a % 3 == 0 || b % 3 == 0)) return;

        String output = "박수";
        if (a % 3 == 0) output += "짝";
        if (b % 3 == 0) output += "짝";

        System.out.println(output);
    }
}
