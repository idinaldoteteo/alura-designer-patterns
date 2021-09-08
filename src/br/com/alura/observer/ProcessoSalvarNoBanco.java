package br.com.alura.observer;

public class ProcessoSalvarNoBanco implements PedidoAcao {

	@Override
	public void executarAcao(GerarPedido dados) {
		System.out.println(this.getClass().getSimpleName());
	}

}
