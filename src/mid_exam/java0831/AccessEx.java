package mid_exam.java0831;

class Sample {
    public int a;
    private int b;
    int c;
}

public class AccessEx {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.a = 3;
//        sample.b = 3;
        sample.c = 4;

        System.out.printf("a=%d, c=%d", sample.a, sample.c);
    }
}
