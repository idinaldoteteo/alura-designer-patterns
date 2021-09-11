package br.com.alura.test;

import java.math.BigDecimal;
import java.util.Objects;

import br.com.alura.proxy.Orcamento;

public class OrcamentoProxy extends Orcamento{

	private BigDecimal valorOrcamento;
	private Orcamento orcamento;

	public OrcamentoProxy(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
	@Override
	public BigDecimal getValor() {
		if( Objects.isNull(valorOrcamento))
			this.valorOrcamento = orcamento.getValor();
		
		return this.valorOrcamento;
	}
	
}
