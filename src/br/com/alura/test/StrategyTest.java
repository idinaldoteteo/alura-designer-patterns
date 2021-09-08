package br.com.alura.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.alura.strategy.ICMS;
import br.com.alura.strategy.ISS;
import br.com.alura.strategy.Orcamento;

@TestInstance(Lifecycle.PER_CLASS)
public class StrategyTest {

	private Orcamento orcamento;

	@BeforeAll
	void init() {
		orcamento = new Orcamento(new BigDecimal("100"));
	}
	
	@Test
	void calcularImpostoISS() {
		assertEquals(new BigDecimal("6.00"), orcamento.calcularImposto(new ISS()));
	}
	
	@Test
	void calcularICMS() {
		assertEquals(new BigDecimal("10.00"), orcamento.calcularImposto(new ICMS()));
	}
}
