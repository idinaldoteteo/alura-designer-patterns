package br.com.alura.chainOfResponsability;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Orcamento {

	private BigDecimal valor;
	private List<String> itens;

	public Orcamento(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public void addItem(String item) {
		if(Objects.isNull(itens))
			itens = new ArrayList<>();
		
		itens.add(item);
	}
	
	public int getTotalItens() {
		return itens.size();
	}

}
