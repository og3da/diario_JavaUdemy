package model.services;

public class BrazilTaxService {
	
	// método que calcula o imposto do aluguel de carro
	public double tax(double amount) {
		if (amount <= 100) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}

}
