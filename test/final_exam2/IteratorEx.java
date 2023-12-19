package final_exam2;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }
        v.add(3, 10);

        Iterator<Integer> it = v.iterator();
        int sum = 0, length = 0;
        while (it.hasNext()) {
            sum += it.next();
            length += 1;
        }

        System.out.println("mean = " + (double)sum / length);
    }
}
