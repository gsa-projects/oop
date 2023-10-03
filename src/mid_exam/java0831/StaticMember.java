package mid_exam.java0831;

import java.util.Scanner;

class CurrencyConverter {
    private static double rate;

    public static double toDollar(double won) {
        return won / rate;
    }
    public static double toWon(double dollar) {
        return dollar * rate;
    }
    public static void setRate(double _rate) {
        rate = _rate;
    }
}

public class StaticMember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("환율 (1달러): ");
        double rate = scanner.nextDouble();

        CurrencyConverter.setRate(rate);

        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
        System.out.println("$100는 " + CurrencyConverter.toWon(100) + "입니다.");
    }
}
