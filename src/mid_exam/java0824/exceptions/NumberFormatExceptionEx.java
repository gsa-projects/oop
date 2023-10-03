package mid_exam.java0824.exceptions;

public class NumberFormatExceptionEx {
    public static void main(String[] args) {
        String inputs[] = { "23", "12", "3.141592", "998" };

        int i = 0;
        try {
            for (i = 0; i < inputs.length; i++) {
                System.out.println("정수로 변환된 값은 " + Integer.parseInt(inputs[i]));
            }
        } catch (NumberFormatException err) {
            System.out.println(inputs[i] + "는 정수로 변환할 수 없습니다.");
        }
    }
}
