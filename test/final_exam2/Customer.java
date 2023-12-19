package final_exam2;

interface Buy {
    void buy();
    default void order() {
        System.out.println("구매 주문");
    }
}

interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}

public class Customer implements Buy, Sell {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.order();
        customer.buy();
        customer.sell();
        Buy buyer = customer;
        buyer.order();
        buyer.buy();
        Sell seller = customer;
        seller.order();
        seller.sell();
    }

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }
}
