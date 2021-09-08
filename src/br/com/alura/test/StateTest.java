package br.com.alura.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.alura.state.Aprovado;
import br.com.alura.state.EmAnalise;
import br.com.alura.state.Finalizado;
import br.com.alura.state.Orcamento;
import br.com.alura.state.OrcamentoException;
import br.com.alura.state.Reprovado;


public class StateTest {

	private Orcamento orcamento;
	
	@Test
	void orcamentoEmAnalise() {
		orcamento = new Orcamento(new BigDecimal("1000"));
		assertEquals(EmAnalise.class, orcamento.getSituacaoOrcamento().getClass());
	}
	
	@Test
	void orcamentoAprovado() {
		orcamento = new Orcamento(new BigDecimal("1000"));
		orcamento.calcularDescontoExtra();
		orcamento.aprovar();
		assertEquals(Aprovado.class, orcamento.getSituacaoOrcamento().getClass());
	}
	
	@Test
	void orcamentoReprovado() {
		orcamento = new Orcamento(new BigDecimal("1000"));
		orcamento.calcularDescontoExtra();
		orcamento.reprovar();
		assertEquals(Reprovado.class, orcamento.getSituacaoOrcamento().getClass());
	}
	
	@Test
	void orcamentoFinalizado() {
		orcamento = new Orcamento(new BigDecimal("1000"));
		orcamento.calcularDescontoExtra();
		orcamento.aprovar();
		orcamento.finalizar();
		assertEquals(Finalizado.class, orcamento.getSituacaoOrcamento().getClass());
	}
	
	@Test
	void receberExeptionOrcamentoReprovatoIndoParaAprovado() {
		orcamento = new Orcamento(new BigDecimal("1000"));
		orcamento.reprovar();
		
		assertThrows(OrcamentoException.class, () -> orcamento.aprovar());
	}
	
}
