package mid_exam.java0914;

class Point1 {
    private int x, y;

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + this.x + ", " + this.y + ")";
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Point1 p = new Point1(2, 3);
        System.out.println(p + "입니다.");
    }
}
