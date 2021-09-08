package br.com.alura.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.alura.chainOfResponsability.Desconto;
import br.com.alura.chainOfResponsability.DescontoParaCincoItens;
import br.com.alura.chainOfResponsability.DescontoParaValorMaiorCem;
import br.com.alura.chainOfResponsability.Orcamento;
import br.com.alura.chainOfResponsability.SemDeconto;

public class ChainOfResponsabilityTest {

	private Orcamento orcamento;
	private Desconto desconto;

	@Test
	void comMaisDeCincoItens() {
		orcamento = new Orcamento(new BigDecimal("100"));
		orcamento.addItem("Chave");
		orcamento.addItem("Chave 1");
		orcamento.addItem("Chave 2");
		orcamento.addItem("Chave 3");
		orcamento.addItem("Chave 4");
		orcamento.addItem("Chave 5");
		desconto = new DescontoParaCincoItens(new SemDeconto());
		assertEquals(new BigDecimal("10.00"), desconto.calular(orcamento));
	}
	
	@Test
	void comValorMaioCem() {
		orcamento = new Orcamento(new BigDecimal("110"));
		orcamento.addItem("Chave");
		orcamento.addItem("Chave 1");
		orcamento.addItem("Chave 2");
		desconto = new DescontoParaCincoItens(new DescontoParaValorMaiorCem(new SemDeconto()));
		assertEquals(new BigDecimal("5.50"), desconto.calular(orcamento));
	}
	
	@Test
	void comDescontoZero() {
		orcamento = new Orcamento(new BigDecimal("90"));
		orcamento.addItem("Chave");
		orcamento.addItem("Chave 1");
		orcamento.addItem("Chave 2");
		desconto = new DescontoParaCincoItens(new DescontoParaValorMaiorCem(new SemDeconto()));
		assertEquals(new BigDecimal("0"), desconto.calular(orcamento));
	}
	
}
