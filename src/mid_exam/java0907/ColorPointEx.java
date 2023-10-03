package mid_exam.java0907;

class Point {
    private int x, y;

//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.printf("(%d, %d)\n", this.x, this.y);
    }
}

class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(this.color);
        this.showPoint();
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(3, 5);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(2, 5);
        cp.setColor("red");
        cp.showColorPoint();
    }
}
