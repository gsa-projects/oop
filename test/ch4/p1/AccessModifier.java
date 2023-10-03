package ch4.p1;

public class AccessModifier {
    public static void main(String[] args) {
        Something some = new Something();

        System.out.println(some.publical);
        System.out.println(some.defaultical);
        System.out.println(some.protectical);
    }
}
