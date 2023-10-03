package mid_exam.java0824.problems;

import java.util.Random;
import java.util.Scanner;

// p.159 - open challenge
public class Problem3 {
    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            Random random = new Random();

            int tried = 0;
            int key = random.nextInt(100);
            System.out.println("수를 결정하였습니다. 맞추어 보세요 (0-99).");

            while (true) {
                System.out.printf("%d try >> ", tried + 1);

                Scanner scanner = new Scanner(System.in);
                int ans = scanner.nextInt();

                if (ans > key) {
                    System.out.println("더 낮게");
                } else if (ans < key) {
                    System.out.println("더 높게");
                } else {
                    System.out.println("맞았습니다");
                    System.out.print("다시 하시겠습니까? (y/n) >> ");

                    Scanner scannerLoop = new Scanner(System.in);
                    String answer = scannerLoop.next();

                    if (answer.equals("n")) {
                        flag = false;
                    }

                    break;
                }

                tried++;
            }
        }
    }
}
