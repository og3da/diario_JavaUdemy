package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Date dtContrato;
	private Integer numeroContrato;
	private Double valorTotal;
	
	private List<Parcelas> parcelas = new ArrayList<Parcelas>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// construtor
	public Contrato(Date dtContrato, int numeroContrato, Double valorTotal) {
		this.dtContrato = dtContrato;
		this.numeroContrato = numeroContrato;
		this.valorTotal = valorTotal;
	}
	
	// getters setters
	public Date getdtContrato() {
		return dtContrato;
	}

	public void setdtContrato(Date dtContrato) {
		this.dtContrato = dtContrato;
	}

	public Integer getnumeroContrato() {
		return numeroContrato;
	}

	public void setnumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Double getvalorTotal() {
		return valorTotal;
	}

	public void setvalorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcelas> getParcelas() {
		return parcelas;
	}
	
	// methods
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("\nPARCELAS:\n");
		
		for (Parcelas parcela : parcelas) {
			sb.append(sdf.format(parcela.getDtPagamento()) + " - $" + String.format("%.2f", parcela.getValor()) + "\n");
		}
		
		return sb.toString();
	}
}
