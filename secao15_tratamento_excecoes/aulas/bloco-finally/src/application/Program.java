package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		/* 
		 * O BLOCO "finally" É EXECUTADO INDEPENDENTEMENTE SE FINALIZAR NO TRY OU NO CATCH
		 */
		
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("finally block executed");
		}
	}
}