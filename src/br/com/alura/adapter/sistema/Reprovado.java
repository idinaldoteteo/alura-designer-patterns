package br.com.alura.adapter.sistema;

public class Reprovado extends SituacaoOrcamento {
		
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacaoOrcamento(new Finalizado());
	}
}
