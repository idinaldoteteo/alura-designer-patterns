package br.com.alura.adapter.sistema;

public class ProcessoEnviarEmail implements PedidoAcao {

	@Override
	public void executarAcao(GerarPedido dados) {
		System.out.println(this.getClass().getSimpleName());
	}

}
