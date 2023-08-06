package app;

import entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        // recebendo dados
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        // retornando dados
        System.out.println("Employee: " + employee);

        // porcentagem aumentar
        System.out.println();
        System.out.print("Wich percentage to increase? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        // retornando dados
        System.out.print("Updated data: " + employee);

        sc.close();
    }
}
