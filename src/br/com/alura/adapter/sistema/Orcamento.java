package br.com.alura.adapter.sistema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Orcamento {
	private BigDecimal valor;
	private List<String> itens;
	private SituacaoOrcamento situacaoOrcamento;

	public Orcamento(BigDecimal valor) {
		this.valor = valor;
		this.situacaoOrcamento = new EmAnalise();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void addItem(String item) {
		if (Objects.isNull(itens))
			itens = new ArrayList<>();

		itens.add(item);
	}

	public int getTotalItens() {
		return itens.size();
	}
	
	public void calcularDescontoExtra() {
		this.valor = this.valor.subtract(this.situacaoOrcamento.calcularDescontoExtra(this));
	}
	
	public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
		this.situacaoOrcamento = situacaoOrcamento;
	}
	
	public SituacaoOrcamento getSituacaoOrcamento() {
		return situacaoOrcamento;
	}

	public void aprovar() {
		this.situacaoOrcamento.aprovar(this);
	}
	public void reprovar() {
		this.situacaoOrcamento.reprovar(this);
	}
	public void finalizar() {
		this.situacaoOrcamento.finalizar(this);
	}

	public boolean isFinalizado() {
		return situacaoOrcamento instanceof Finalizado;
	}
}
