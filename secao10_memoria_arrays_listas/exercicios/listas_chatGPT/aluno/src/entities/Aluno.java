package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private Integer idade;
	private List<String> disciplinas = new ArrayList<>();

	// construtor padrao
	public Aluno(String nome, Integer idade, List<String> disciplinas) {
		this.disciplinas = disciplinas;
		this.nome = nome;
		this.idade = idade;
	}

	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getDisciplinas() {
		return "\nDisciplinas matriculadas: \n" + disciplinas;
	}

	public void setDisciplinas(List<String> disciplinas) {
		this.disciplinas = disciplinas;
	}

	// metodos
	public String toString() {
		return "Nome aluno: " + nome + "\nIdade aluno: " + idade + "\nMatérias que esta matriculado:" + "\n"
				+ disciplinas;
	}

}
