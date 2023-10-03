package mid_exam.java0907;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Student extends Person {
    int id;
    int grade;

    public Student(String name, int id, int grade) {
        super(name);
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + this.id + ")";
    }
}

public class UpcastingEx {
    public static void main(String[] args) {
        Student s = new Student("rhs", 22027, 2);
        Person p = s;

        System.out.println(s + " " + p);

        s.grade = 3;
        s.name = "rhh";

        // check: s와 업캐스팅된 p가 같은 레퍼런스를 참조하고 있다는 것을 알 수 있음.
        System.out.println(s + " " + p);
    }
}
