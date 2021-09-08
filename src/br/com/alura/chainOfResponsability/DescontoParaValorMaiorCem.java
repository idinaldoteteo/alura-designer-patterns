package br.com.alura.chainOfResponsability;

import java.math.BigDecimal;

public class DescontoParaValorMaiorCem extends Desconto{

	public DescontoParaValorMaiorCem(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calular(Orcamento orcamento) {
		if( orcamento.getValor().compareTo(new BigDecimal("100")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		return proximo.calular(orcamento);
	}

}
