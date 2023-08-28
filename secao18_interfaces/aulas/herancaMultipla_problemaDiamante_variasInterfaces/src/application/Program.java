package application;

import model.entities.ConcrectScanner;
import model.entities.ComboDevice;
import model.entities.ConcrectPrinter;

public class Program {
	public static void main(String[] args) {
		
		ConcrectPrinter impressora = new ConcrectPrinter("01"); // instanciando impressora
		ConcrectScanner escaner = new ConcrectScanner("02"); // instanciando scaner
		ComboDevice combo = new ComboDevice("003"); // instanciando dispositivo scanner & impressora
		
		// usando impressora
		System.out.println("IMPRESSORA:");
		impressora.processDoc("folha de pagamento");
		impressora.print("folha de pagamento");
		
		// usando scanner
		System.out.println("\nSCANNER:");
		escaner.processDoc("folha de pagamento");
		System.out.println("Resultado do scan> " + escaner.scan());
		
		// usando dispositivo combo
		System.out.println("\nCOMBO DISPOSITIVO: ");
		combo.processDoc("folha de pagamento");
		System.out.println("Resultado do scan> " + combo.scan());
		combo.print("folha de pagamento");
	}
}
