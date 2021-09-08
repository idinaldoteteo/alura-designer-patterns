package br.com.alura.templateMethod;

import java.math.BigDecimal;

public class DescontoParaValorMaiorCem extends Desconto{

	public DescontoParaValorMaiorCem(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected boolean deveEfetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("100")) > 0;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
		
	}

}
