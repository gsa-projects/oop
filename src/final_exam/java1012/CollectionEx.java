package final_exam.java1012;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionEx {
    static void printList(LinkedList<String> l) {
        Iterator<String> iterator = l.iterator();

        while (iterator.hasNext()) {
            String e = iterator.next();
            String separator;
            if (iterator.hasNext())
                separator = "->";
            else
                separator = "\n";

            System.out.print(e + separator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("가");
        list.add("나");
        list.add("다");
        list.add(0, "라");
        list.add(2, "마");
        list.add("바");
        list.add("사");
        System.out.print("원본: ");
        printList(list);

        Collections.sort(list);
        System.out.print("정렬: ");
        printList(list);

        Collections.reverse(list);
        System.out.print("역순: ");
        printList(list);

//        Collections.sort(list);
        int index = Collections.binarySearch(list, "마");
        System.out.println(index);
//        System.out.println(index + ": " + list.get(index));
    }
}
