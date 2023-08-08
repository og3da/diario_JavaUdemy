package app;

import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double deposit, withdraw;
        ContaBancaria contaBancaria;

        System.out.print("Enter account number: ");
        int nroConta = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)?  ");
        String answear = sc.nextLine().substring(0,1);

        // verificando deposito inicial
        if (answear.equals("y")) {
            System.out.print("\nEnter a initial deposit value: ");
            deposit = sc.nextDouble();
            contaBancaria = new ContaBancaria(nroConta, nomeTitular, deposit);
        }
        else {
            contaBancaria = new ContaBancaria(nroConta, nomeTitular);
        }

        // exibindo dados
        System.out.println(contaBancaria);

        // deposito
        System.out.print("\nEnter a deposit value: ");
        deposit = sc.nextDouble();
        contaBancaria.deposito(deposit);
        System.out.println("\nUpdated account data: " + contaBancaria);

        // saque
        System.out.print("\nEnter a withdraw value: ");
        withdraw = sc.nextDouble();
        contaBancaria.saque(withdraw);
        System.out.println("\nUpdated account data: " + contaBancaria);
    }
}
