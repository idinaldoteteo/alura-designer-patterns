package br.com.alura.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {
	
	private BigDecimal valor;
	private List<Orcavel> itemOrcamento;

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itemOrcamento = new ArrayList<>();
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public void adicionarItem(Orcavel itemOrcamento) {
		this.itemOrcamento.add(itemOrcamento);
		this.valor = valor.add(itemOrcamento.getValor());
	}
	
}
