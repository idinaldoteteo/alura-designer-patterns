package br.com.alura.observer;

public class ProcessoEnviarEmail implements PedidoAcao {

	@Override
	public void executarAcao(GerarPedido dados) {
		System.out.println(this.getClass().getSimpleName());
	}

}
