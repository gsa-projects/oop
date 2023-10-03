package final_exam.java0921;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);

        Iterator<Integer> it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        int sum = 0;
        for (var iter = v.iterator(); iter.hasNext();) {
            sum += iter.next();
        }
        System.out.println("sum: " + sum);
    }
}
