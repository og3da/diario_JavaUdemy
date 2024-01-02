package entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    // constructors
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    // getters setters
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    // methods
    @Override
    public String priceTag() {
        return super.getName() + " $" + String.format("%.2f", super.getPrice())
                + " (Customs fee: $" + String.format("%.2f",customsFee) + ")";
    }
}
