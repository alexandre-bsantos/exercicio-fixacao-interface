package model.entities;

import java.util.Date;

public class Parcela {

	private Date dataParcela;
	private Double valorParcela;
	
	public Parcela() {
	}

	public Parcela(Date dataParcela, Double valorParcela) {
		super();
		this.dataParcela = dataParcela;
		this.valorParcela = valorParcela;
	}

	public Date getDataParcela() {
		return dataParcela;
	}

	public void setDataParcela(Date dataParcela) {
		this.dataParcela = dataParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}
}
