package mid_exam.java0914;

abstract class Calculator {
    public abstract int add(int a, int b);

    public abstract int sub(int a, int b);

    public abstract double avg(int[] a);
}

public class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public double avg(int[] a) {
        int sum = 0;
        for (int e : a) {
            sum += e;
        }
        return (double) sum / a.length;
    }

    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2, 3));
        System.out.println(c.sub(2, 3));
        System.out.println(c.avg(new int[]{1, 2, 3}));
    }
}
