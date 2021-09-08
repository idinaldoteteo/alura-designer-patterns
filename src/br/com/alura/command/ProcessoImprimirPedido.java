package br.com.alura.command;

public class ProcessoImprimirPedido implements RegrasPedido {

	@Override
	public void executar(GerarPedido dados) {
		System.out.println(this.getClass().getSimpleName());
		System.out.println(" ** IMPRESSÃO DO PEDIDO ** ");
		System.out.println("NOME: " + dados.getCliente().getNome());
		System.out.println("Valor Orçamento: " + dados.getOrcamento().getValor() ) ;
		System.out.println(" Total de itens: " + dados.getOrcamento().getTotalItens());
	}

}
