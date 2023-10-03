package mid_exam.java0817;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("name = " + name + ", ");

        String city = scanner.next();
        System.out.println("city = " + city + ", ");

        int age = scanner.nextInt();
        System.out.println("age = " + age + ", ");

        double weight = scanner.nextDouble();
        System.out.println("weight = " + weight + ", ");

        boolean single = scanner.nextBoolean();
        System.out.println("single = " + single);
    }
}
