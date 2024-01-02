package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;


public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();

		// course A
		System.out.print("How many students for course A? ");
		int qtd = sc.nextInt();

		for (int i=0; i<qtd; i++) {
			System.out.print(" student ID: ");
			int id = sc.nextInt();

			set.add(new Student(id));
		}

		// course B
		System.out.print("\nHow many students for course B? ");
		qtd = sc.nextInt();

		for (int i=0; i<qtd; i++) {
			System.out.print(" student ID: ");
			int id = sc.nextInt();

			set.add(new Student(id));
		}

		// course C
		System.out.print("\nHow many students for course C? ");
		qtd = sc.nextInt();

		for (int i=0; i<qtd; i++) {
			System.out.print(" student ID: ");
			int id = sc.nextInt();

			set.add(new Student(id));
		}


		System.out.println("\nTotal students: " + set.size());
	}

}
