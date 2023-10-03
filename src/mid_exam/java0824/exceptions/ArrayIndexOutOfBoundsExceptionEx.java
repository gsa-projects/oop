package mid_exam.java0824.exceptions;

public class ArrayIndexOutOfBoundsExceptionEx {
    public static void main(String[] args) {
        int intArray[] = new int[5];

        try {
            for (int i = 0; i < intArray.length; i++) {
                intArray[i + 1] = i + 1 + intArray[i];
                System.out.printf("intArray[%d] = %d\n", i, intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }
    }
}
