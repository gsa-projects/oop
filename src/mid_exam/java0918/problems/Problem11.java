package mid_exam.java0918.problems;

import java.util.Scanner;

interface Stack {
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}

class StringStack implements Stack {
    private String[] content;
    private int capacity;
    private int length;

    public StringStack(int capacity) {
        this.capacity = capacity;
        this.content = new String[this.capacity];
        this.length = 0;
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public int capacity() {
        return this.capacity;
    }

    @Override
    public String pop() {
        return this.content[--this.length];
    }

    @Override
    public boolean push(String val) {
        if (this.length >= this.capacity) {
            return false;
        }

        this.content[this.length++] = val;
        return true;
    }
}

// p.319 - 9
public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int capacity = scanner.nextInt();

        StringStack stack = new StringStack(capacity);
        while (true) {
            System.out.print("문자열 입력 >> ");
            String query = scanner.next();

            if (query.equals("그만")) {
                System.out.print("스택에 저장된 모든 문자열 팝 : ");
                while (stack.length() > 0) {
                    System.out.print(stack.pop() + " ");
                }
                break;
            }

            boolean isPushed = stack.push(query);
            if (!isPushed) {
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }
        }
    }
}
