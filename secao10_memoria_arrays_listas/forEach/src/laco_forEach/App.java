package laco_forEach;

public class App {
	public static void main(String[] args) {
		String[] vect = new String[] { "Maria", "Bob", "Alex" }; // inserindo valores já na instancia

		// for convencional
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println("---------");

		// for each
		for (String nome : vect) {
			System.out.println(nome);
		}

	}
}
