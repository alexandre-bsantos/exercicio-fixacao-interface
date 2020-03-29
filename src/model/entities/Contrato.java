package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.services.ContratoService;

public class Contrato {

	private Integer numero;
	private Date data;
	private double totalValue;
	
	private Parcela parcela;
	
	List<Parcela> parcelas = new ArrayList<>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Contrato() {
	}

	public Contrato(Integer numero, Date data, double totalValue, Parcela parcela) {
		this.numero = numero;
		this.data = data;
		this.totalValue = totalValue;
		this.parcela = parcela;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public Parcela getParcela() {
		return parcela;
	}

	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}	
	
	public void valorParcelas(ContratoService contrato) {
		for (Parcela p : parcelas) {
			double valor = contrato.valoresParcela(contrato);
			
		}
	}
}
