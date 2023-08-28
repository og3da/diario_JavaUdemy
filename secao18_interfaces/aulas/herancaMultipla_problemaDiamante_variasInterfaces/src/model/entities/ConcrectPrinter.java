package model.entities;

public class ConcrectPrinter extends Device implements Printer {

	public ConcrectPrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
	

}
