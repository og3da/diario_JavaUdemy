package model.entities;

import java.time.LocalDateTime;

public class CarRental {

	// atributos
	private LocalDateTime start;
	private LocalDateTime finish;
	
	// associações (composição): essa classe é composta por Veículo e Fatura
	private Vehicle vehicle;
	private Invoice invoice;
	
	// sobrecarga
	public CarRental() {}

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		super();
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	// getters setters
	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	// methods
}
