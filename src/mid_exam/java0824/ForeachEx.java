package mid_exam.java0824;

public class ForeachEx {
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5 };
        String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };

        int sum = 0;
        for (int e : n) {
            System.out.print(e + " ");
            sum += e;
        }
        System.out.println("합은 " + sum);

        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
