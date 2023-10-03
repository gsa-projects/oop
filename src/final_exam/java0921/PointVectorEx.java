package final_exam.java0921;

import java.util.Vector;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}

public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<>();

        v.add(new Point(5, 3));
        v.add(new Point(4, 3));
        v.add(new Point(-1, 2));

        v.add(2, new Point(8, -9));

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }
}
