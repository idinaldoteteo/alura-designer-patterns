package br.com.alura.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import br.com.alura.observer.Cliente;
import br.com.alura.observer.GerarPedido;
import br.com.alura.observer.GerarPedidoHandler;
import br.com.alura.observer.Orcamento;
import br.com.alura.observer.PedidoAcao;
import br.com.alura.observer.ProcessoEnviarEmail;
import br.com.alura.observer.ProcessoImprimirPedido;
import br.com.alura.observer.ProcessoSalvarNoBanco;

@TestInstance(Lifecycle.PER_CLASS)
public class ObserverTest {

	private Orcamento orcamento;
	private Cliente cliente;
	
	@BeforeAll
	void init() {
		orcamento = new Orcamento(new BigDecimal("5000"));
		orcamento.addItem("Chave");
		orcamento.addItem("Chave 1");
		orcamento.addItem("Chave 2");
		orcamento.addItem("Chave 3");
		orcamento.addItem("Chave 4");
		cliente = new Cliente("Milene Teteo");
	}

	@Test
	void executandoProcessoSalvarNoBranco() {
		GerarPedido dados = new GerarPedido(cliente, orcamento);
		List<PedidoAcao> acoesList = Arrays.asList(new ProcessoSalvarNoBanco(), new ProcessoImprimirPedido(), new ProcessoEnviarEmail());
		GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler(dados, acoesList );
		gerarPedidoHandler.executar();
	}
}
