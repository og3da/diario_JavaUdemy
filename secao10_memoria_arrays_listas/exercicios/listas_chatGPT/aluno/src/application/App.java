package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Aluno> listaAlunos = new ArrayList<>();

		// adicionar alunos
		System.out.print("Digite a quantidade de alunos a cadastrar: ");
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= N; i++) {
			System.out.println();
			System.out.println("Aluno #" + i);
			System.out.print("Nome: ");
			String informacoesAluno = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			// add disciplinas
			List<String> disciplinas = new ArrayList<>();
			System.out.print("Digite a quantidade de materias: ");
			int qtdMaterias = sc.nextInt();
			sc.nextLine();
			for (int ii=1; ii<=qtdMaterias; ii++) {
				System.out.print("materia: ");
				disciplinas.add(sc.nextLine());
			}
			listaAlunos.add(new Aluno(informacoesAluno, idade, disciplinas));
		}

		// buscar aluno
		System.out.println("---------------------");
		System.out.println();
		System.out.print("Digite o nome de um aluno para buscar os dados: ");
		String nomeAlunoInformacoes = sc.nextLine();
		Aluno informacoesAluno = listaAlunos.stream().filter(x -> x.getNome().equals(nomeAlunoInformacoes)).findFirst().orElse(null);
		System.out.println();
		if (informacoesAluno == null) {
			System.out.println("Aluno não existente");
		}
		else if (informacoesAluno != null) {
			System.out.println(informacoesAluno);
		}

		// disciplinas aluno especifico
		System.out.println("---------------------");
		System.out.println();
		System.out.print("Digite o nome de um aluno para buscar as disciplinas: ");
		String nomeAlunoDisciplinas = sc.nextLine();
		Aluno disciplinasAluno = listaAlunos.stream().filter(x -> x.getNome().equals(nomeAlunoDisciplinas)).findFirst().orElse(null);
		System.out.println();
		if (disciplinasAluno == null) {
			System.out.println("Aluno não existente");
		}
		else if (disciplinasAluno != null) {
			System.out.println("Disciplinas matriculadas:");
			System.out.println(disciplinasAluno.getDisciplinas());
		}

		sc.close();
	}
}
