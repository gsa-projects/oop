package mid_exam.java0821;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        System.out.println("exit을 입력하면 종료합니다.");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">>");
            String text = scanner.nextLine();

            /*
             * String literal을 사용하면 string pool 메모리에 저장되기 때문에 주솟값이 같음
             * new String으로 초기화하면 항상 새로운 인스턴스가 만들어져서 주솟값이 매번 다름
             *
             * `==` 연산자는 주소를 비교하고, `.equals()`는 값을 비교함
             * 그래서 아래 코드를 text == "exit"으로 하면 작동이 안됨
             */
            if (text.equals("exit")) {
                break;
            }
        }

        System.out.println("종료합니다.");

        scanner.close();
    }
}
