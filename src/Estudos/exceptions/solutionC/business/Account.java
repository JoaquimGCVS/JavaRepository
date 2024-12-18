package Estudos.exceptions.solutionC.business;

import Estudos.exceptions.solutionC.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account (Integer number, String holder, Double balance, Double withdrawLimit) {
        setNumber(number);
        setHolder(holder);
        validateBalance(balance);
        setWithdrawLimit(withdrawLimit);
        this.balance=balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    private void validateBalance(Double balance) {
        if (balance<=0) {
            throw new DomainException("The account balance cannot be zero");
        }
        this.balance=balance;
    }
    public void deposit(Double amount) {
        if (amount!=null && amount>0) {
            this.balance += amount;
        }
    }
    public void withdraw(Double amount) {
        if (amount>this.balance) {
            throw new DomainException("The amount value of the withdraw is bigger than the account total balance");
        }
        if (amount>this.withdrawLimit) {
            throw new DomainException("The amount value of the withdraw is bigger than the account withdrawLimit");
        }
        validateBalance(this.balance);
        this.balance -= amount;    }

    @Override
    public String toString() {
        return "Number: " + getNumber() +
                " ,Holder: " + getHolder() +
                ", Balance: " + getBalance() +
                ", Withdraw Limit: " + getWithdrawLimit();
    }
}
