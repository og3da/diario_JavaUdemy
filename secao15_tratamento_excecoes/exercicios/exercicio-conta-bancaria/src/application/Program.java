package application;

import models.Account;
import models.exception.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("-- Enter account data --");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            System.out.print("Holder: ");
            sc.next();
            String holder = sc.next();
            System.out.print("Initial balance: ");
            Double initalBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initalBalance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            Double amountWithdraw = sc.nextDouble();
            account.withdraw(amountWithdraw);
            System.out.println(account);
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
