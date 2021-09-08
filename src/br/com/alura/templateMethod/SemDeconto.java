package br.com.alura.templateMethod;

import java.math.BigDecimal;

public class SemDeconto extends Desconto {

	public SemDeconto() {
		super(null);
	}

	@Override
	protected boolean deveEfetuarCalculo(Orcamento orcamento) {
		return true;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
