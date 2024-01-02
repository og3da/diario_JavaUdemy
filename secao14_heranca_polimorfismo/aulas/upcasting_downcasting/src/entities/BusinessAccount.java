package entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    // sobrecarga
    public BusinessAccount() {

    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    // getters and setters
    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    // methods
    public void loan(Double amount) {
        balance += amount -10;
    }
}
