package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int N = sc.nextInt();
        for (int i=1; i<=N; i++) {
            System.out.println("\nEmployee #" +i+ " data:");
            System.out.print("Outsourced (y/n)?: ");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                Double additional = sc.nextDouble();
                employeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, additional));
            }
            else {
                employeeList.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS: ");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }

        sc.close();
    }
}
