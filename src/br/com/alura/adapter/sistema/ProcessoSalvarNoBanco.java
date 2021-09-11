package br.com.alura.adapter.sistema;

public class ProcessoSalvarNoBanco implements PedidoAcao {

	@Override
	public void executarAcao(GerarPedido dados) {
		System.out.println(this.getClass().getSimpleName());
	}

}
