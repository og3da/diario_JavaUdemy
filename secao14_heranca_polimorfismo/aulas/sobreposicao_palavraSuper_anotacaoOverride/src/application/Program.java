package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println("account: " +acc1.getNumber()+ ", balance: " +acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "ana", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println("\naccount: " +acc2.getNumber()+ ", balance: " +acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "ana", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println("\naccount: " +acc3.getNumber()+ ", balance: " +acc3.getBalance());
    }
}
