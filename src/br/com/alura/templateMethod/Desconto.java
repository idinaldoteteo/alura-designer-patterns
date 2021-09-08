package br.com.alura.templateMethod;

import java.math.BigDecimal;

public abstract class Desconto {

	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	protected BigDecimal calcular(Orcamento orcamento) {
		if(deveEfetuarCalculo(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}
	
	protected abstract boolean deveEfetuarCalculo(Orcamento orcamento);
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
}
