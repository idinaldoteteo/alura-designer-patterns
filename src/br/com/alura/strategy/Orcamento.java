package br.com.alura.strategy;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	
	public Orcamento(BigDecimal valor) {
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	public BigDecimal calcularImposto(Imposto imposto) {
		return imposto.calcula(this);
	}
	
}
