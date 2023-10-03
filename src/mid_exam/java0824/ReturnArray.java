package mid_exam.java0824;

public class ReturnArray {
    static int[] makeArray(int size) {
        return new int[size];
    }

    public static void main(String[] args) {
        int[] array = makeArray(5);

        for (var e : array) {
            System.out.print(e + " ");
        }
    }
}
