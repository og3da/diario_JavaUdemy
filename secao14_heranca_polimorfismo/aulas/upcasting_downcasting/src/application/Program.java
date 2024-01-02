package application;

//sobreposicao_palavraSuper_anotacaoOverride

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);

        // UPCASTING: convertendo uma subclasse para superclasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "ana", 0.0, 0.01);

        // DOWNCASTING: convertendo uma superclasse para subclasse
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);


        // BusinessAccount acc5 = (BusinessAccount) acc3;
        /*
           essa linha acima, mesmo não sendo indicada como erro pelo compilador vai resultar em um erro
           pois o objeto acc3 na verdade é uma instancia de SavingsAccount.

           - nas condicionais abaixo vamos fazer:
           se o objeto acc3 for uma instancia de BusinessAccount, vamos criar a variavel acc5 e converter acc3 para BusinessAccount,
           em seguida realizar um emprestimo;

           se o objeto acc3 for uma instancia de SavingsAccount, vamos criar a variavel acc5 e converter acc3 para SavingsAccount,
           em seguida realizar uma atualizacao de saldo;

           assim estamos evitando o erro de conversao.
        */

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }
}
