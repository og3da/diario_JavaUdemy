package entities;

public class PessoaJuridica extends Contribuinte {
    private int nroFuncionarios;

    // constructor
    public PessoaJuridica(String nome, Double rendaAnual, int nroFuncionarios) {
        super(nome, rendaAnual);
        this.nroFuncionarios = nroFuncionarios;
    }

    // getters setters
    public int getNroFuncionarios() {
        return nroFuncionarios;
    }

    public void setNroFuncionarios(int nroFuncionarios) {
        this.nroFuncionarios = nroFuncionarios;
    }

    // methods
    @Override
    public double impostoPago() {
        double imposto = 0;
        if (nroFuncionarios > 10) {
            imposto = getRendaAnual() * 0.14;
        }
        else {
            imposto = getRendaAnual() * 0.16;
        }

        return imposto;
    }
}
