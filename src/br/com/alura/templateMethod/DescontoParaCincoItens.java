package br.com.alura.templateMethod;

import java.math.BigDecimal;

public class DescontoParaCincoItens extends Desconto{

	public DescontoParaCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected boolean deveEfetuarCalculo(Orcamento orcamento) {
		return  orcamento.getTotalItens() > 5;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.10"));
	}


}
