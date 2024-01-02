package model.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcelas;

public class ContratoService {
	
	ServicoPagamentoOnline servicoPagamentoOnline;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
	
	// construtor
	public ContratoService(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}

	// methods
	// metodo deve calcular valor de cada parcela e definir data
	public void processamentoContrato(Contrato contrato, int meses) {
		
		for (int i=1; i<=meses; i++) {
			double valorParcela = contrato.getvalorTotal() / meses;
			Date dtPagamento = contrato.getdtContrato();
			cal.setTime(dtPagamento);
			cal.add(Calendar.MONTH, i);  // Adiciona 1 mês à data atual
			dtPagamento = cal.getTime(); // Atualiza a data com o novo valor
			valorParcela += servicoPagamentoOnline.juros(valorParcela, i);
			valorParcela += servicoPagamentoOnline.taxaPagamento(valorParcela);
			contrato.getParcelas().add(new Parcelas(dtPagamento, valorParcela));
		}
	}

}
