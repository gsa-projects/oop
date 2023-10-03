package mid_exam.java0907;

class PointS {
    private int x, y;

    public PointS(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.printf("(%d, %d)\n", this.x, this.y);
    }
}

class ColorPointS extends PointS {
    private String color;

    public ColorPointS(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(this.color);
        this.showPoint();
    }
}

public class ColorPointExWithSuper {
    public static void main(String[] args) {
        PointS p = new PointS(3, 5);
        p.showPoint();

        ColorPointS cp = new ColorPointS(2, 5, "red");
        cp.showColorPoint();
    }
}
