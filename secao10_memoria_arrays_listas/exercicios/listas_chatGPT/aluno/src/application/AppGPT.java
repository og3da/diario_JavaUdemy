package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class AppGPT {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			List<Aluno> listaAlunos = cadastrarAlunos(sc);

			buscarInformacoesAluno(sc, listaAlunos);
			buscarDisciplinasAluno(sc, listaAlunos);
		}
	}

	private static List<Aluno> cadastrarAlunos(Scanner sc) {
		List<Aluno> listaAlunos = new ArrayList<>();

		System.out.print("Digite a quantidade de alunos a cadastrar: ");
		int N = sc.nextInt();
		sc.nextLine();

		// Loop de cadastro de alunos
		for (int i = 1; i <= N; i++) {
			System.out.println();
			System.out.println("Aluno #" + i);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			// loop adição disciplinas
			List<String> disciplinas = new ArrayList<>();
			System.out.print("Digite a quantidade de materias: ");
			int qtdMaterias = sc.nextInt();
			sc.nextLine();
			for (int ii = 1; ii <= qtdMaterias; ii++) {
				System.out.print("materia: ");
				disciplinas.add(sc.nextLine());
			}
			// instanciando objeto Aluno na lista com todos atributos
			listaAlunos.add(new Aluno(nome, idade, disciplinas));
		}

		return listaAlunos;
	}

	private static void buscarInformacoesAluno(Scanner sc, List<Aluno> listaAlunos) {
		// Busca e exibição das informações do aluno
		Aluno objAluno = null;
		do {
			System.out.print("---------------------\n\nDigite o nome de um aluno para buscar os dados: ");
			String nomeAluno = sc.nextLine();
			objAluno = retornaAluno(nomeAluno, listaAlunos);
		} while (objAluno == null);

		System.out.println("\n" + objAluno);

	}

	private static void buscarDisciplinasAluno(Scanner sc, List<Aluno> listaAlunos) {
		// Busca e exibição das disciplinas do aluno
		Aluno objAluno = null;
		do {
			System.out.print("---------------------\n\nDigite o nome de um aluno para buscar as disciplinas: ");
			String nomeAluno = sc.nextLine();
			objAluno = retornaAluno(nomeAluno, listaAlunos);
		} while (objAluno == null);

		System.out.println(objAluno.getDisciplinas());

	}

	private static Aluno retornaAluno(String nomeAluno, List<Aluno> listaAlunos) {
		Aluno objAluno = listaAlunos.stream().filter(x -> x.getNome().equals(nomeAluno)).findFirst().orElse(null);
		if (objAluno == null) {
			System.out.println("\nAluno não existente, digite novamente");
		}
		return objAluno;
	}
}