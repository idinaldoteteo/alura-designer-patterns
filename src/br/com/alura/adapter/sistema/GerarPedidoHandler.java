package br.com.alura.adapter.sistema;

import java.util.List;

public class GerarPedidoHandler {

	private GerarPedido dados;
	private List<PedidoAcao> acoesList;

	public GerarPedidoHandler(GerarPedido dados, List<PedidoAcao> acoesList) {
		this.dados = dados;
		this.acoesList = acoesList;
	}

	public void executar() {
		acoesList.forEach( acao -> acao.executarAcao(dados));
	}
}
