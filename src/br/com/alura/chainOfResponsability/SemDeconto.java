package br.com.alura.chainOfResponsability;

import java.math.BigDecimal;

public class SemDeconto extends Desconto {

	public SemDeconto() {
		super(null);
	}

	@Override
	public BigDecimal calular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
