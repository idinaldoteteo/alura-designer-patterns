package br.com.alura.strategy;

import java.math.BigDecimal;

public interface Imposto {

	BigDecimal calcula(Orcamento orcamento);
	
}
