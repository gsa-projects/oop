package mid_exam.java0831;

class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        Circle circles[] = new Circle[5];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i);
        }

        for (Circle circle : circles) {
            System.out.print((int)circle.getArea() + " ");
        }
    }
}
