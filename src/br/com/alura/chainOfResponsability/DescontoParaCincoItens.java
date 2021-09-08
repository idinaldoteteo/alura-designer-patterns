package br.com.alura.chainOfResponsability;

import java.math.BigDecimal;

public class DescontoParaCincoItens extends Desconto{

	public DescontoParaCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calular(Orcamento orcamento) {
		if( orcamento.getTotalItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.10"));
		}
		
		return proximo.calular(orcamento);
	}


}
