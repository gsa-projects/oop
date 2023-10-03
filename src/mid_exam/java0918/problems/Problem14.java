package mid_exam.java0918.problems;

import java.util.Scanner;

// p.386 - 8
//public class Problem14 {
//    public static void main(String[] args) {
//        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
//        Scanner scanner = new Scanner(System.in);
//
//        String query = scanner.nextLine();
//        for (int i = 1; i <= query.length(); i++) {
//            for (int j = 0; j < query.length(); j++) {
//                System.out.print(query.charAt((i + j) % query.length()));
//            }
//            System.out.println();
//        }
//    }
//}

public class Problem14 {
    public static void main(String[] args) {
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        Scanner scanner = new Scanner(System.in);

        String query = scanner.nextLine();
        for (int i = 1; i <= query.length(); i++) {
            System.out.print(query.substring(i) + query.substring(0, i));
            System.out.println();
        }
    }
}