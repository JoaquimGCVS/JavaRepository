package Estudos.collections.List.E;

public class BankAccount {
    private int numberAccount;
    private double balance;

    public BankAccount(int numberAccount, double balance) {
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "numberAccount=" + numberAccount +
                ", balance=" + balance +
                '}';
    }
}
