package mid_exam.java0831;

class StaticSample {
    public int n;
    public static int m;

    public static void f() {
        m = 5;
    }
    public void g() {
        m = 20;
    }
    public void h() {
        m = 30;
    }
}

public class StaticEx {
    public static void main(String[] args) {
        StaticSample s1, s2;

        s1 = new StaticSample();
        s1.n = 5;
        s1.g();
        s1.m = 50;

        s2 = new StaticSample();
        s2.n = 8;
        s2.h();
        s2.f();

        System.out.println(s1.m);

//        s1.m = 30;
//        s1.n = 30;
//        System.out.printf("s1(m=%d, n=%d), s2(m=%d, n=%d)\n", s1.m, s1.n, s2.m, s2.n);
//        s2.m = 15;
//        s2.n = 15;
//        System.out.printf("s1(m=%d, n=%d), s2(m=%d, n=%d)\n", s1.m, s1.n, s2.m, s2.n);
//        s1.g();
//        System.out.printf("s1(m=%d, n=%d), s2(m=%d, n=%d)\n", s1.m, s1.n, s2.m, s2.n);
    }
}
