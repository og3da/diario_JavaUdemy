package entities;

public class SavingsAccount extends Account {
    private Double interestRate;

    public  SavingsAccount() {}

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    // methods
    @Override // anotação para sobrescrever o metodo da classe pai
    public void withdraw(Double amount) {
        balance -= amount;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }
}
