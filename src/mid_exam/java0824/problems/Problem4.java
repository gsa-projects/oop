package mid_exam.java0824.problems;

import java.util.Scanner;

// p.168 - 14
public class Problem4 {
    public static void main(String[] args) {
        String courses[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
        int scores[] = { 95, 88, 76, 62, 55 };

        while (true) {
            System.out.print("과목 이름 >> ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();

            if (input.equals("그만"))
                break;

            boolean isFound = false;
            int findIdx = 0;
            for (int i = 0; i < courses.length; i++) {
                if (input.equals(courses[i])) {
                    isFound = true;
                    findIdx = i;
                    break;
                }
            }

            if (isFound)
                System.out.printf("%s의 점수는 %d\n", courses[findIdx], scores[findIdx]);
            else
                System.out.println("없는 과목입니다.");
        }
    }
}
