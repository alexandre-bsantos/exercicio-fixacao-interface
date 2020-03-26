package model.services;

public class PayPalTaxaService {

	public double valorTaxa(double valorParcela) {
		double valorTotal = (valorParcela * 0.01) + valorParcela;
	}
}
