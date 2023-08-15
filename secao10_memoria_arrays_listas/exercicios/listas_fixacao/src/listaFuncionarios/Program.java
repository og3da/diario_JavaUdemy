package listaFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> listaFuncionarios = new ArrayList<>();

		// recebendo dados de funcionarios
		System.out.print("How many employees will be registred?: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();

			// logica para validar id existente
			Employee funcionarioID = listaFuncionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if (funcionarioID != null) {
				System.out.println("ID EXISTENT!");
				continue;
			} 
			else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				listaFuncionarios.add(new Employee(id, name, salary));
			}
		}

		// aumento de salario
		System.out.println();
		System.out.print("Enter the employee id that increase salary: ");
		int id = sc.nextInt();
		Employee funcionarioID = listaFuncionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (funcionarioID != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			funcionarioID.increaseSalary(percentage);
		} else {
			System.out.println("ID INEXISTENTE!");
		}

		// exibindo lista de funcionarios
		System.out.println();
		System.out.println("LIST OF EMPLOYEES:");
		for (Employee funcionario : listaFuncionarios) {
			System.out.println(funcionario);
		}

		sc.close();
	}
}
