package entities;

public class PessoaFisica extends Contribuinte {
    private Double gastosSaude;

    // constructor
    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    // getters setters
    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    // methods
    @Override
    public double impostoPago() {
        double imposto = 0;
        if (getRendaAnual() < 20000) {
            imposto = getRendaAnual() * 0.15 - (gastosSaude * 0.5);
        }
        else {
            imposto = (getRendaAnual() * 0.25) - (gastosSaude * 0.5);
        }

        return imposto;
    }
}
