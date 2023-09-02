package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Covariancia {
	public static void main(String[] args) {
		// Princípio get/put - covariância
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		list.add(20); // erro de compilacao
		
		/* NO CASO USANDO O CURINGA: "<? extends Number>" 
		 * ESTAMOS DECLARANDO QUE ESSA LISTA PODE CONTER UM NUMBER
		 * OU QUALQUER SUBTIPO DELA (todos tipos numericos)
		 * NESSE CASO SOMOS IMPEDIDOS DE FAZER UM .add() 
		 * POIS O COMPILADOR NAO SABE SE O TIPO DE VALOR A ADICIONAR REALMENTE É UM NUMBER OU SUBTIPO
		 */
	}
}
