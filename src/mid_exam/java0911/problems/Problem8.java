package mid_exam.java0911.problems;

class ColorPoint {
    private int x, y;
    private String color;

    ColorPoint() {
        this.x = 0;
        this.y = 0;
        this.color = "BLACK";
    }

    ColorPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + "색의 (" + this.x + "," + this.y + ")의 점";
    }
}

// p.317 - 6
public class Problem8 {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
    }
}
