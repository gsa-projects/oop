package final_exam;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("3");
        v.add("4");
        v.add("5");

        v.remove(1);
        System.out.println(v);
        v.remove("3");
        System.out.println(v);
    }
}
