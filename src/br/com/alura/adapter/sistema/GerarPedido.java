package br.com.alura.adapter.sistema;

public class GerarPedido {

	private Cliente cliente;
	private Orcamento orcamento;
	
	public GerarPedido(Cliente cliente, Orcamento orcamento) {
		this.cliente = cliente;
		this.orcamento = orcamento;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Orcamento getOrcamento() {
		return orcamento;
	}
	
}
