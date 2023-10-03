package mid_exam.java0831.problems;

import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.printf("(%.1f,%.1f)%d\n", this.x, this.y, this.radius);
    }
}

// p.243 - 5
public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circles[] = new Circle[3];

        for (int i = 0; i < circles.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius  = scanner.nextInt();

            circles[i] = new Circle(x, y, radius);
        }

        for (Circle circle : circles) {
            circle.show();
        }
    }
}
