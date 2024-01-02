package app;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("nome do aluno: ");
        student.nome = sc.nextLine();
        System.out.print("nota 1: ");
        student.n1 = sc.nextDouble();
        System.out.print("nota 2: ");
        student.n2 = sc.nextDouble();
        System.out.print("nota 3: ");
        student.n3 = sc.nextDouble();

        System.out.println();
        System.out.println(student.finalNote());

        sc.close();
    }
}
