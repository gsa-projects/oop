package mid_exam.java0904.problems;

import java.util.Scanner;

class Dictionary {
    private static String kor[] = { "사랑", "아기", "돈", "미래", "희망" };
    private static String eng[] = { "love", "baby", "money", "future", "hope" };
    public static String kor2eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) {
                return eng[i];
            }
        }

        return null;
    }
}

// p.246 - 10
public class Problem7 {
    public static void main(String[] args) {
        System.out.println("한영 단어 검색 프로그램입니다.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("한글 단어?");
            String query = scanner.next();

            if (query.equals("그만")) {
                break;
            }

            String searched = Dictionary.kor2eng(query);

            if (searched == null) {
            System.out.printf("%s는 저의 사전에 없습니다.\n", query);
            } else {
                System.out.printf("%s은 %s\n", query, searched);
            }
        }
    }
}
