package model.services;

import java.util.Calendar;

import model.entities.Contrato;

public class ContratoService {

	private Integer numParcelas;
	private TaxaService taxaService;
	
	public ContratoService() {
	}
	
	public ContratoService(Integer numParcelas, TaxaService taxaService) {
		this.numParcelas = numParcelas;
		this.taxaService = taxaService;
	}

	public Integer getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(Integer numParcelas) {
		this.numParcelas = numParcelas;
	}

	public TaxaService getTaxaService() {
		return taxaService;
	}

	public void setTaxaService(TaxaService taxaService) {
		this.taxaService = taxaService;
	}
	
	public void valoresParcela(Contrato contrato) {
		Calendar cal = Calendar.getInstance();
		for (int i = 1; i <= numParcelas; i++) {
			taxaService.valorTaxa(contrato.getTotalValue(), numParcelas);
			cal.get(cal.get(Calendar.MONTH + 1));
		}
	}
	
}
