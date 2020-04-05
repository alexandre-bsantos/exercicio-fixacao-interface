package model.services;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;

public class ContratoService {

	private PagamentoService pagamentoService;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ContratoService() {
	}
	
	public ContratoService(PagamentoService pagamentoService) {
		this.pagamentoService = pagamentoService;
	}
	
	public void processoContratual(Contrato contrato, Integer meses) {
		Calendar cal = Calendar.getInstance();
		Date dataParcela = contrato.getData();
		cal.setTime(dataParcela);
		double valorContrato = contrato.getTotalValue() / meses;
		
		for (int i = 1; i <= meses; i++) {
			cal.add(Calendar.MONTH, 1);
			dataParcela = cal.getTime();
			pagamentoService.valorTaxa(valorContrato, i);
			System.out.println(sdf.format(dataParcela) + " - " + String.format("%.2f", pagamentoService.valorTaxa(valorContrato, i)));
		
		}
	}
}
