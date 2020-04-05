package model.services;

public class PayPalService implements PagamentoService{
	
	@Override
	public double taxaPagamento(double valorTotal) {
		double valor = valorTotal * 0.02 + valorTotal;
		return valor;
	}
	
	@Override
	public double valorTaxa(double valorTotal, int meses) {
		double valorParcela = valorTotal * 0.01 * meses + valorTotal;
		double total = taxaPagamento(valorParcela);
		return total;
	}
}