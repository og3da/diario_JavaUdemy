package model.entities;

public class ConcrectScanner extends Device implements Scanner {

	public ConcrectScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	public String scan() {
		return "Scanned content";
	}
}
