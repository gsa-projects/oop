package mid_exam.java0918.problems;

import java.util.Scanner;

// p.386 - 7-(2)
public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(">> ");
            String query = scanner.nextLine();

            if (query.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }

            // check: 배열은 length가 프로퍼티인데, String 같은 레퍼런스 타입은 메소드임;
            System.out.println("어절 개수는 " + query.split(" ").length);
        }
    }
}
