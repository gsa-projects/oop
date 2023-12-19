package final_exam;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello world";

        System.out.println("s = " + s);
        System.out.println("s.charAt(4) = " + s.charAt(4));
        System.out.println("s.split(\" \") = " + Arrays.toString(s.split(" ")));
        System.out.println("s.contains(\"w\") = " + s.contains("w"));

    }
}
