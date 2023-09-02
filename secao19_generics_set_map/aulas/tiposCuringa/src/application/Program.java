package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	// método que printa uma lista de qualquer tipo, usando curinga '?'
	// tipos curinga nao permitem adicionar dados
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}