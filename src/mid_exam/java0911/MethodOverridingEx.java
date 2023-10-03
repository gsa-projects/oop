package mid_exam.java0911;

class Shape {
    protected String name;
    public Shape next;
    public Shape() {
        this.next = null;
    }

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    private String name;

    @Override
    public void draw() {
        this.name = "Circle";
        super.name = "Shape";
        super.draw();
        System.out.println(this.name);
    }
}

public class MethodOverridingEx {
    public static void main(String[] args) {
//        (new Line()).draw();
//        (new Shape()).draw();
//        (new Rect()).draw();

        (new Circle()).draw();
        (new Shape()).draw();


        // check: 동적 바인딩과 정적 바인딩이 뭐야?
    }
}
