package br.com.alura.adapter.sistema;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}

	
	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacaoOrcamento(new Reprovado());
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacaoOrcamento(new Finalizado());
	}
}
