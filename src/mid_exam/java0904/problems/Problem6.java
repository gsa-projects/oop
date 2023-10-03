package mid_exam.java0904.problems;

import java.util.Scanner;

class Phone {
    String name;
    String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}

// p.245 - 8
public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수 >> ");
        int headcount = scanner.nextInt();

        Phone phones[] = new Phone[headcount];
        for (int i = 0; i < phones.length; i++) {
            System.out.print("이름과 전화번호 (이름과 번호는 빈 칸 없이 입력) >> ");
            phones[i] = new Phone(scanner.next(), scanner.next());
        }
        System.out.println("저장되었습니다...");

        while (true) {
            System.out.print("검색할 이름 >> ");

            String query = scanner.next();
            if (query.equals("그만")) {
                break;
            }

            boolean find = false;
            for (Phone phone : phones) {
                if (phone.name.equals(query)) {
                    System.out.printf("%s의 번호는 %s 입니다.\n", phone.name, phone.tel);
                    find = true;
                    break;
                }
            }

            if (!find) {
                System.out.printf("%s 이 없습니다.\n", query);
            }
        }
    }
}
