package final_exam.java0921;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하세요: ");
            String s = scanner.next();
            a.add(s);
        }

        for (String name : a) {
            System.out.print(name + " ");
        }

        int longestIdx = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).length() > a.get(longestIdx).length()) {
                longestIdx = i;
            }
        }

        System.out.println("\n가장 긴 이름은 " + a.get(longestIdx));
    }
}
