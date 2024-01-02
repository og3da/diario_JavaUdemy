package entities;

public abstract class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    // sobrecarga
    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    // getters and setters
    public Integer getNumber() {
        return number;
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

    // methods
    public void withdraw(Double amount) {
        balance -= amount + 5;
    }

    public void deposit(Double amount) {
        balance += amount;
    }
}
