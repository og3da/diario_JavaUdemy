package app;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double qtdDolar, cotacaoDolar;

        System.out.print("what is the dollar price? ");
        cotacaoDolar = sc.nextDouble();
        System.out.print("how many dollars will be bought? ");
        qtdDolar = sc.nextDouble();
        System.out.printf("\nAmount to be paid in R$ = %.2f", CurrencyConverter.converter(qtdDolar, cotacaoDolar));

        sc.close();
    }
}
