package mid_exam.java0831;

import java.util.Scanner;

class Currency {
    double perDollar;
    String symbol;

    public Currency(double perDollar, String symbol) {
        this.perDollar = perDollar;
        this.symbol = symbol;
    }

    static Currency $ = new Currency(1, "$");

    public Converter to(Currency currency) {
        return new Converter(this, currency);
    }

    public double toDollar(double amount) {
        return (new Converter(this, $)).amount(amount);
    }
}

class Converter {
    Currency from, to;

    public Converter(Currency from, Currency to) {
        this.from = from;
        this.to = to;
    }

    public double amount(double amount) {
        double converted = amount / this.from.perDollar * this.to.perDollar;
        return Math.round(converted * 100.0) / 100.0;
    }
}

public class CurrencySystem {
    public static void main(String[] args) {
        Currency won = new Currency(1323.97, "₩");
        Currency peso = new Currency(16.76, "₱");

        Scanner scanner = new Scanner(System.in);
        System.out.print("원화로 얼마 있음: ");
        double amount = scanner.nextDouble();

        System.out.println("현재 그 돈은 페소로 " + peso.symbol + won.to(peso).amount(amount));
    }
}