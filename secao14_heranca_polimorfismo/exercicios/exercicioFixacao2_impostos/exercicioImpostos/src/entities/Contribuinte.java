package entities;

// esta vai ser abstrata pois não deve ser instanciada
// e também pq tem um método abstrato!
public abstract class Contribuinte {
    private String nome;
    private Double rendaAnual;

    // constructor
    public Contribuinte(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    // getters setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    // methods
    public abstract double impostoPago();
    // este método vai ser abstrato pois o calculo de imposto é diferente para PF e PJ.

}
