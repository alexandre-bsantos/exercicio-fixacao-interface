package model.services;

public interface PagamentoService {

	double taxaPagamento(double valorTotal);
	double valorTaxa(double valorTotal, int meses);
}
