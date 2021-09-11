package br.com.alura.decorator;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Imposto {

	private Imposto outro;
	
	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcula(Orcamento orcamento) {
		BigDecimal  valorImposto = realizarCalculo(orcamento);
		BigDecimal outroImpoto = BigDecimal.ZERO;
		if( Objects.nonNull(outro)) {
			outroImpoto = outro.realizarCalculo(orcamento);
		}
		
		return valorImposto.add(outroImpoto);
	}
	
}
