package mid_exam.java0907;

import java.util.Arrays;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price / 10);
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class Fridge extends Product {
    Fridge() {
        super(150);
    }

    @Override
    public String toString() {
        return "Fridge";
    }
}

class Buyer {
    int money = 450;
    int bonuspoint = 0;
    int productCount = 0;
    Product[] products = new Product[10];

    void buy(Product p) {
        if (this.money < p.price) {
            System.out.println(p + "을/를 사기에는 잔액이 부족합니다. (" + money + " < " + p.price +")");
            return;
        }

        this.money -= p.price;
        this.bonuspoint += p.bonusPoint;
        this.products[productCount++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

public class ProductEx {
    public static void main(String[] args) {
        Buyer rhs = new Buyer();
        rhs.buy(new Computer());
        rhs.buy(new Audio());
        rhs.buy(new Tv());
        rhs.buy(new Fridge());

        System.out.println("현재 남은 돈은 " + rhs.money);
        System.out.println("현재 보너스 포인트는 " + rhs.bonuspoint);
        System.out.println("현재 구매하신 물품은 " + Arrays.toString(rhs.products));
    }
}
