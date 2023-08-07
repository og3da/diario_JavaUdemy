package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converter(double qtdDolar, double cotacaoDolar) {
        double somaIOF = (qtdDolar * cotacaoDolar) * IOF;
        double valorFinal = (qtdDolar * cotacaoDolar) + somaIOF;
        return valorFinal;
    }
}
