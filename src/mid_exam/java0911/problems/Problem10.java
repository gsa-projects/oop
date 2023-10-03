package mid_exam.java0911.problems;

class PositivePoint {
    int x, y;

    public PositivePoint() {
        this.x = 0;
        this.y = 0;
    }

    public PositivePoint(int x, int y) {
        this.x = x >= 0 ? x : 0;
        this.y = y >= 0 ? y : 0;
    }

    public void move(int x, int y) {
        if (x >= 0)
            this.x = x;

        if (y >= 0)
            this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")의 점";
    }
}

// p.318 - 8
public class Problem10 {
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, -5);
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}
