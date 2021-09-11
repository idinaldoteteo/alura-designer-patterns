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
public class CompositeTest {

	private Orcamento orcamento;
	private OrcamentoProxy proxy;

	@BeforeAll
	void init() {
		orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("400")));
		proxy = new OrcamentoProxy(orcamento);
	}
	
	@Test
	void valorOrcamentoQuatrocentos() {
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		assertEquals(new BigDecimal("400"), proxy.getValor());
	}
	

}
