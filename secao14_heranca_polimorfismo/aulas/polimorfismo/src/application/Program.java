package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        /* POLIMORFISMO:
           Em Programação Orientada a Objetos, polimorfismo é um recurso que
           permite que variáveis de um mesmo tipo mais genérico possam
           apontar para objetos de tipos específicos (especialização) diferentes,
           tendo assim comportamentos diferentes conforme cada tipo específico.
        */

        // nesse caso estamos criando as variaveis x, y do tipo Account (genérico)
        // instanciando cada variavel como um objeto específico (especialização)
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        // pelo fato do método "withdraw" ser diferente na Classe "Account" e "SavingsAccount",
        // o resultado vai ser diferente!
        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println("ACCOUNT: "+x.getBalance());
        System.out.println("SAVINGS ACCOUNT: "+y.getBalance());
    }
}
