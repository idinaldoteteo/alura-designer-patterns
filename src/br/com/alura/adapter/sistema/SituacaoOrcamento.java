package br.com.alura.adapter.sistema;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new OrcamentoException("Orçamento não pode ser Aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new OrcamentoException("Orçamento não pode ser Reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new OrcamentoException("Orçamento não pode ser Finalizado!");
	}
}
