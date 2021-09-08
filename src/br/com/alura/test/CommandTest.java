package br.com.alura.test;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.alura.command.Cliente;
import br.com.alura.command.GerarPedido;
import br.com.alura.command.GerarPedidoHandler;
import br.com.alura.command.Orcamento;

@TestInstance(Lifecycle.PER_CLASS)
public class CommandTest {

	private Orcamento orcamento;
	private Cliente cliente;
	
	@BeforeAll
	void init() {
		orcamento = new Orcamento(new BigDecimal("100"));
		orcamento.addItem("Chave");
		orcamento.addItem("Chave 1");
		orcamento.addItem("Chave 2");
		orcamento.addItem("Chave 3");
		orcamento.addItem("Chave 4");
		orcamento.addItem("Chave 5");
		cliente = new Cliente("Idinaldo Teteo");
	}

	@Test
	void executandoProcessoSalvarNoBranco() {
		GerarPedido dados = new GerarPedido(cliente, orcamento);
		GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler(dados);
		gerarPedidoHandler.executar();
	}
}
