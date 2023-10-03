package mid_exam.java0828;

public class CircleWithConstructor {
    int radius;
    String name;

    public CircleWithConstructor(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        CircleWithConstructor pizza = new CircleWithConstructor(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);


        CircleWithConstructor donut = new CircleWithConstructor(2, "자바도넛");

        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
