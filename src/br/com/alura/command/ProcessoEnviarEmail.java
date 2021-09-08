package br.com.alura.command;

public class ProcessoEnviarEmail implements RegrasPedido {

	@Override
	public void executar(GerarPedido dados) {
		System.out.println(this.getClass().getSimpleName());
	}

}
