package model.services;

public class PaypalService implements ServicoPagamentoOnline {

	public double taxaPagamento(double valor) {
		
		return valor * 0.02;
	}

	public double juros(double valor, int mesParcela) {
		
		return valor * 0.01 * mesParcela;
	}
	
}
