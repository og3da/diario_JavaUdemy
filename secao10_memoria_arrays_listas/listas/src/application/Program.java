package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		// criando Lista do tipo string 
		List<String> list = new ArrayList<>(); //ArrayList é a implementação da interface List (veremos futuramente)
		// adicionando valores a lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		// exibindo tamanho
		System.out.println("tamanho da lista: " + list.size());
		
		// printando nomes na lista
		for (String x : list) {
			System.out.println(x);
		}
		
		// printando lista sem nomes com começo M
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		// printando posição na lista de um nome existente e nao existente
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // existente
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // n existente
		
		// filtrando nomes que começam com A
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		// filtrando primeiro nome que começa com J; exibe null caso nao exista;
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}