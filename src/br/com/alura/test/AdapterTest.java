package br.com.alura.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.alura.adapter.JavaHttpClient;
import br.com.alura.adapter.sistema.Finalizado;
import br.com.alura.adapter.sistema.Orcamento;
import br.com.alura.adapter.sistema.RegistroOrcamento;

@TestInstance(Lifecycle.PER_CLASS)
public class AdapterTest {

	private Orcamento orcamento;

	@BeforeAll
	void init() {
		orcamento = new Orcamento(new BigDecimal("100"));
		orcamento.addItem("Item ");
		orcamento.addItem("Item ");
		orcamento.addItem("Item ");
	}
	
	@Test
	void orcamentoEstaFinalizado() {
		orcamento.aprovar();
		orcamento.finalizar();
		assertEquals(Finalizado.class, orcamento.getSituacaoOrcamento().getClass());
	}
	
	@Test
	void rodarClasseAdapter() {
		RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());
		registroOrcamento.registar(orcamento);
	}
}
