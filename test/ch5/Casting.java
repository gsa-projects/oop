package ch5;

class Life {
    protected int age;
    protected boolean isMale;

    public Life(int age, boolean isMale) {
        this.age = age;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" + this.age + ", " + this.isMale + ")";
    }
}

class Person extends Life {
    protected String name;

    public Person(int age, boolean isMale, String name) {
        super(age, isMale);
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.age + ", " + this.isMale + ")";
    }
}

class Cat extends Life {
    public Cat(int age, boolean isMale) {
        super(age, isMale);
    }
}

class Dog extends Life {
    public Dog(int age, boolean isMale) {
        super(age, isMale);
    }
}

class Student extends Person {
    public int id;

    public Student(int age, boolean isMale, String name, int id) {
        super(age, isMale, name);
        this.id = id;
    }
}

public class Casting {
    public static void main(String[] args) {
        Life rhs = new Student(18, true, "rhs", 22027);

        System.out.println(rhs.age);
        System.out.println(((Person) rhs).name);
        System.out.println(((Student) rhs).id);
    }
}
