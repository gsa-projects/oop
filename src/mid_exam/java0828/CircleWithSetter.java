package mid_exam.java0828;

public class CircleWithSetter {
    int radius;
    String name;

    public CircleWithSetter(int radius) {
        this.radius = radius;
    }

    // boiler plate 의 서막
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        CircleWithSetter pizza = new CircleWithSetter(1);
        pizza.setRadius(4);
        pizza.name = "자바피자";

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        CircleWithSetter donut = new CircleWithSetter(5);
        donut.setRadius(2);
        donut.name = "자바도넛";

        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
