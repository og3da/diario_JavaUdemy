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

    @Override // nesse caso estamos sobrescrevendo a classe pai, aplicando a mesma logica de saque
    // ex: sacando com uma taxa de 5$ e aplicando mais uma taxa de 2$ para a BusinessAccount
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2;
    }
}
