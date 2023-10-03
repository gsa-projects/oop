package mid_exam.java0907;

class Life {
    String specificName;
    int age;

    public Life(String specificName, int age) {
        this.specificName = specificName;
        this.age = age;
    }

    @Override
    public String toString() {
        return specificName +"("+age+")";
    }
}

class Human extends Life {
    String name;

    public Human(String name, String specificName, int age) {
        super(specificName, age);
        this.name = name;
    }

    @Override
    public String toString() {
        return specificName +"("+age+", "+name+")";
    }
}

public class DowncastingEx {
    public static void main(String[] args) {
        // check: 당연히 life에는 Human 클래스에 필요한 것들이 구현되어 있지 않으니 다운캐스팅이 될리가 없다.
//        Life life = new Life("Homo Sapiens", 12);
//        Human human = (Human)life;

        // check: 이렇게 미리 업캐스팅이 선행된 후에야, 업캐스팅은 서브 클래스와 같은 레퍼런스를 참조하나,
        //  일부만을 컨트롤할 수 있게 제한한 것이니 당연히 다운캐스팅이 가능해진다.
        Life life = new Human("rhs", "Homo Sapiens", 12);
        Human human = (Human)life;

        System.out.println(human);
    }
}
