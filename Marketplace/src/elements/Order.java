package elements;

public class Order {
    protected double amount;
    protected double price;
    protected int traderId;
}

    public Order(int traderId, double amount, double price) {
        this.traderId = traderId;
        this.amount = amount;
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public int getTraderId() {
        return traderId;
    }

public double getDollars() {
    return amount * price;
}
