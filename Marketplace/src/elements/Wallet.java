package elements;

public class Wallet {
    private double dollars; // Dólares disponíveis
    private double coins; // PQoins disponíveis
    private double blockedDollars; // Dólares bloqueados
    private double blockedCoins; // Moedas bloqueadas
}

    public Wallet(double dollars, double coins) {
        this.dollars = dollars;
        this.coins = coins;
        blockedDollars = 0.0;
        blockedCoins = 0.0;
    }

    public void depositDollars(double dollars) {
        this.dollars += dollars;
    }

    public void depositCoins(double coins) {
        this.coins += coins;
    }

    public void withdrawDollars(double dollars) {
        this.dollars -= dollars;
    }

    public void withdrawCoins(double coins) {
        this.coins -= coins;
    }

    public void blockDollars(double dollars) {
        this.dollars -= dollars;
        blockedDollars += dollars;
    }

    public void blockCoins(double coins) {
        this.coins -= coins;
        blockedCoins += coins;
    }

    // Devolve valores bloqueados para o saldo disponível.
    public void returnDollars(double dollars) {
        this.dollars += dollars;
        blockedDollars -= dollars;
    }

    // Remove valores diretamente do saldo bloqueado (para quando a transação é
    // confirmada)
    public void payFromBlockedDollars(double dollars) {
        blockedDollars -= dollars;
    }

    public void payFromBlockedCoins(double coins) {
        blockedCoins -= coins;
    }

    // Verificam se há saldo suficiente para operações (disponível ou bloqueado)

    public boolean checkWithdrawDollars(double dollars) {
        return dollars <= this.dollars;
    }
