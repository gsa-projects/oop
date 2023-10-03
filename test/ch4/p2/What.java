package ch4.p2;

import ch4.p1.Something;

public class What extends Something {
    void check() {
        System.out.println(this.protectical);
    }

    public static void main(String[] args) {
        Something some = new Something();
        System.out.println(some.publical);
//        System.out.println(some.protec);
    }
}
