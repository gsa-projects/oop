package final_exam.java0921;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        // check: 사실 Collection에는 Wrapper 클래스 인스턴스만 들어가는데, jdk가 자동 박싱/언박싱해줘서 이렇게 기본 타입 값을 함수에 넣어도 되는거임
        v.add(5);
        v.add(4);
        v.add(4);
        v.add(4);v.add(4);v.add(4);v.add(4);v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);

        v.add(-1);

        // check: remove가 인덱스를 받네
        v.add(2, 100);
        v.remove(2);

        System.out.println("size " + v.size());
        // check: capacity는 메모리 할당량인듯
        System.out.println("capacity " + v.capacity());

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            sum += v.elementAt(i);
        }
        System.out.println(sum);
    }
}
