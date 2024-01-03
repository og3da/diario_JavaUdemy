package models;

import models.exception.DomainException;

public class Account {

    Integer number;
    String holder;
    Double balance;
    Double withdrawLimit;

    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
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

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        validateWithdraw(amount);
        this.balance -= amount;
    }

    public void validateWithdraw(Double amount) {
        if (amount > this.withdrawLimit)
            throw new DomainException("Withdraw error: the amount exceeds withdraw limit");
        if (amount > this.balance)
            throw new DomainException("Withdraw error: Not enough balance");
    }

    @Override
    public String toString() {
        return "Balance = " + this.balance;
    }
}
