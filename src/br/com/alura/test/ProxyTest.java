package br.com.alura.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.alura.proxy.ItemOrcamento;
import br.com.alura.proxy.Orcamento;

@TestInstance(Lifecycle.PER_CLASS)
public class ProxyTest {
	private Orcamento antigo;

	@BeforeAll
	void init() {
		antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("400")));
	}
	
	@Test
	void valorOrcamentoQuatrocentos() {
		System.out.println(antigo.getValor());
		assertEquals(new BigDecimal("400"), antigo.getValor());
	}
	
	@Test
	void valorOrcamentoSeiscentos() {
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		novo.adicionarItem(antigo);
		System.out.println(novo.getValor());
		assertEquals(new BigDecimal("600"), novo.getValor());
	}
}
