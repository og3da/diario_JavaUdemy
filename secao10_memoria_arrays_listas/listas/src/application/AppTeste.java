package application;

import java.util.ArrayList;
import java.util.List;

public class AppTeste {
	public static void main(String[] args) {

		// criando Lista do tipo string
		List<String> list = new ArrayList<>(); // ArrayList é a implementação da interface List (veremos futuramente)
		// adicionando valores a lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("LISTA DE NOMES: ");
		for(String nome: list) {
			System.out.println(nome);
		}
		
	}
}
