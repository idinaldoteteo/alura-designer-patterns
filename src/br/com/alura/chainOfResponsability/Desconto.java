package br.com.alura.chainOfResponsability;

import java.math.BigDecimal;

public abstract class Desconto {

	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public abstract BigDecimal calular(Orcamento orcamento);
}
