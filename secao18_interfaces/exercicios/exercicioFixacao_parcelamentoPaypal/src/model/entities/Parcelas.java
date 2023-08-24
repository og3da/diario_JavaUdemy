package model.entities;

import java.util.Date;

public class Parcelas {
	
	private Date dtPagamento;
	private Double valor;
	

	// construtor
	public Parcelas(Date dtPagamento, Double valor) {
		this.dtPagamento = dtPagamento;
		this.valor = valor;
	}
	
	// getters setters
	public Date getDtPagamento() {
		return dtPagamento;
	}


	public void setDtPagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}
}
