package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.services.ContratoService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// recebendo dados de contrato
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero do contrato: ");
		int numeroContrato = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		String dtContrato = sc.next();
		System.out.print("Valor do contrato: ");
		double valorTotal = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int nroParcelas = sc.nextInt();
		
		// criando obj & instanciando service
		Contrato contrato = new Contrato(sdf.parse(dtContrato), numeroContrato, valorTotal);
		
		ContratoService service = new ContratoService(new PaypalService()); // instanciando c/implementacao PaypalService
		service.processamentoContrato(contrato, nroParcelas);
		
		System.out.println(contrato);
	}
}
