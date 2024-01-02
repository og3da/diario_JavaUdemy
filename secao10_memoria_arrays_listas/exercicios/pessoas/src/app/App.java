package app;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double altura;

        // passando dados de cada pessoa
        System.out.print("Quantas pessoas serao digitadas?: ");
        int n = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[n];
        for (int i=0; i< pessoa.length; i++) {
            System.out.println("\nDados da pessoa " + i + ": ");
            System.out.println("Nome:");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.println("Idade:");
            idade = sc.nextInt();
            System.out.println("Altura:");
            altura = sc.nextDouble();
            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        // calculando altura media
        double somaAlturas = 0;
        for (int i=0; i< pessoa.length; i++) {
            somaAlturas += pessoa[i].getAltura();
        }
        double alturaMedia = somaAlturas / pessoa.length;
        System.out.println("Altura média: " + String.format("%.2f", alturaMedia));
        System.out.println();

        // calculando percentual de pessoas menores de 16 anos
        System.out.println("\nPessoas menores de 16 anos:");
        int somaPessoaMenor16 = 0;
        for (int i=0; i< pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16 ) {
                somaPessoaMenor16 += 1;
                System.out.println(pessoa[i].getNome());
            }
            else {
                continue;
            }
        }
        double percentualMenores16 = ((double)somaPessoaMenor16 / n) *100;
        System.out.println("Percentual de menores: " + String.format("%.2f", percentualMenores16));

        sc.close();
    }
}
