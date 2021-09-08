package br.com.alura.command;

public class GerarPedidoHandler {

	private GerarPedido dados;

	public GerarPedidoHandler(GerarPedido dados) {
		this.dados = dados;
	}

	public void executar() {
		RegrasPedido salvarBanco = new ProcessoSalvarNoBanco();
		salvarBanco.executar(dados);
		
		RegrasPedido imprimirPedido = new ProcessoImprimirPedido();
		imprimirPedido.executar(dados);
		
		RegrasPedido enviarEmail = new ProcessoEnviarEmail();
		enviarEmail.executar(dados);
	}
	
	
}
