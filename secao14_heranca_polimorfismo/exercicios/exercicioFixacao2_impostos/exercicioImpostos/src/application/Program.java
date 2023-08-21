package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> contribuinteList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int N = sc.nextInt();

        // entrada de dados PF e PJ
        for (int i=1; i<=N; i++) {
            System.out.println("\nTax payer #" +i+ " data:");
            System.out.print("Individual or company (f/j)?: ");
            char tipoPessoa = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Anual Income: ");
            double rendaAnual = sc.nextDouble();

            if (tipoPessoa == 'f') {
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();
                contribuinteList.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            }
            else if (tipoPessoa == 'j') {
                System.out.print("Number of employees: ");
                int nroFuncionarios = sc.nextInt();
                contribuinteList.add(new PessoaJuridica(nome, rendaAnual, nroFuncionarios));
            }
        }

        // saida de dados: Impostos de cada pessoa e total arrecadado
        System.out.println("\n----------------");
        System.out.println("TAXES PAID: \n");
        double totalArrecadado = 0;
        for (Contribuinte contribuinte : contribuinteList) {
            totalArrecadado += contribuinte.impostoPago();
            System.out.println(contribuinte.getNome() + ": $" + String.format("%.2f", contribuinte.impostoPago()));
        }
        System.out.println("\nTOTAL TAXES: $" + String.format("%.2f",totalArrecadado));

    }
}
