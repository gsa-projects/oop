package mid_exam.java0914;

interface PhoneInterface {
    // check: 접근 제어자를 생략하면 자동으로 public static 이 부여됨? 아닌거 같은데
    //  - 근데 인터페이스에서 구현된 메소드는 생략이 불가능하심, 그리고 오버라이딩도 안됨
    //  - default는 안되고, public은 되고, private는 안되고, protected는 허용 안되고
    //  - static은 안되고

    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}

// check: 인터페이스는 인터페이스 끼리는 extends임
//  - 인터페이스와 클래스 끼리는 implements
interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface {
    public void play();
    public void stop();
}

class PDA {
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
    @Override
    public void sendCall() {
        System.out.println("따르릉 따르릉");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 왔어요.");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자를 보냈습니다.");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자가 도착했습니다.");
    }

    @Override
    public void play() {
        System.out.println("음악을 재생합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악을 일시 정지 합니다.");
    }

    public void schedule() {
        System.out.println("일정을 관리합니다.");
    }
}

class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.printLogo();
        phone.sendCall();
        phone.play();
        System.out.println("3 + 5 = " + phone.calculate(3, 5));
        phone.schedule();
    }
}
