package mid_exam.java0914;

class Point2 {
    private int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Point2 p = (Point2)obj; // check: 이거 다운 캐스팅이라서 에러 안 나려면 obj가 Point 타입 이여야 함 ㅋㅋ
        return x == p.x && y == p.y;
    }

    public String toString() {
        return "Point(" + this.x + ", " + this.y + ")";
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        Point2 a = new Point2(2, 3);
        Point2 b = new Point2(2, 3);

        if (a == b)
            System.out.println("a == b");
        if (a.equals(b))
            System.out.println("a.equals(b)");
    }
}
