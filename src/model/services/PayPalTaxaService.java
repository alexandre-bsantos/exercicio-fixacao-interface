package model.services;

public class PayPalTaxaService implements TaxaService{
	
	
	@Override
	public double valorTaxa(double valorTotal, int numParcelas) {
		
		double valorParcial = valorTotal / numParcelas;
		
		double taxaMes = valorParcial * 0.01 + valorParcial;
		double valorParcela = taxaMes * 0.02 + taxaMes;
		return valorParcela;
	}
}