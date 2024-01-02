package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;

	// associação (composição): essa classe "serviço aluguel" compõe
	// "BrazilTaxService" que seria o serviço p/calculo de imposto
	private BrazilTaxService taxService;

	// construtor
	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	// methods
	public void processInvoice(CarRental carRental) {
		// metodo calcula valor do aluguel de carro
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60;

		// calculo pagamento aluguel
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours); // Math.ceil arrendonda as horas pra cima
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}

		// calculando imposto
		double tax = taxService.tax(basicPayment);

		// instanciando objeto fatura
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
