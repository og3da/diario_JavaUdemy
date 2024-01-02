package entities;

public class ContaBancaria {
    private int nroConta;
    private String nomeTitular;
    private double saldo;

    // sobrecarga (varios construtores)
    public ContaBancaria(int nroConta, String nomeTitular) {
        this.nroConta = nroConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaBancaria(int nroConta, String nomeTitular, double depositoInicial) {
        this.nroConta = nroConta;
        this.nomeTitular = nomeTitular;
        deposito(depositoInicial);
    }

    // getters and setters
    public int getNroConta() {
        return nroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    // métodos
    public void deposito(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void saque(double valorSaque) { this.saldo = (saldo - valorSaque) -5; } // -5$ de taxa

    public String toString() {
        return "\naccount data: "
                + "\nAccount " + nroConta + ", "
                + "Holder: " + nomeTitular + ", "
                + "Balance: $" + saldo;
    }
}
