package pensionato;

import java.util.Locale;
import java.util.Scanner;

import entitites.Aluguel;

public class app {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		String email;
		int room;
		
		// entrada de qtdaluguel e dados do estudante
		Aluguel[] aluguel = new Aluguel[10];
		System.out.print("How many rooms will be rented?: ");
		int qtdQuartosAlugados = sc.nextInt();
		int quarto = 1;
		for (int i=1; i<=qtdQuartosAlugados; i++) {
			System.out.print("\nRent #" + i +":");
			System.out.print("\nName: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			aluguel[room] = new Aluguel(name, email, room);
		}
		
		// retornando aluguel ocupados
		System.out.println("\nBusy rooms:");
		for (int i=0; i<aluguel.length; i++) {
			if (aluguel[i] != null) {
				System.out.println(aluguel[i].retorno());
			}	
		}
	
		sc.close();
	}
}
