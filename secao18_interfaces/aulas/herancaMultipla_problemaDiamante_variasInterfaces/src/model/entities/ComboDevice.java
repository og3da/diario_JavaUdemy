package model.entities;

public class ComboDevice extends Device implements Printer, Scanner {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Combo device processing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Combo device scanned content";
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Combo device Printing: " + doc);
	}

}
