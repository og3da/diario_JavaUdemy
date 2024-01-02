package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contravariancia {
	public static void main(String[] args) {
		// Princípio get/put - contravariância
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		Number x = myNums.get(0); // erro de compilacao
		
		/* NO CASO USANDO O CURINGA: "<? super Number>" 
		 * ESTAMOS DECLARANDO QUE ESSA LISTA PODE CONTER UM NUMBER
		 * OU QUALQUER SUPERTIPO DELA (OBJECT)
		 * NESSE CASO SOMOS IMPEDIDOS DE FAZER UM .get() 
		 * POIS O COMPILADOR NAO SABE O TIPO DE VALOR ARMAZENADO EM .get(0) POR EXEMPLO 
		 */
	}
}
