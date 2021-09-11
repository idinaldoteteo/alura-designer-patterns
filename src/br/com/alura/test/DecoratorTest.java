package br.com.alura.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.alura.decorator.ICMS;
import br.com.alura.decorator.ISS;
import br.com.alura.decorator.Imposto;
import br.com.alura.decorator.Orcamento;

@TestInstance(Lifecycle.PER_CLASS)
public class DecoratorTest {

	private Orcamento orcamento;

	@BeforeAll
	void init() {
		orcamento = new Orcamento(new BigDecimal("100"));
	}
	
	@Test
	void verificarImpostoIcms() {
		Imposto imposto = new ICMS(null);
		assertEquals(new BigDecimal("10.00"), imposto.calcula(orcamento));
	}
	
	@Test
	void verificarImpostoIcmsComIss() {
		Imposto imposto = new ICMS( new ISS(null));
		assertEquals(new BigDecimal("16.00"), imposto.calcula(orcamento));
	}
}
