package elements;

public class Trader {
    private int id;
    private Wallet wallet;

}

public Trader(double dollars, double coins);

public int sell(double amount, double price, Market market);

public int buy(double amount, double price, Market market);

public static int numberOfUsers=0;