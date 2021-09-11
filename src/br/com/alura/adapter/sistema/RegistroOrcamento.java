package br.com.alura.adapter.sistema;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.adapter.HttpAdapter;

public class RegistroOrcamento {

	private HttpAdapter http;
	
	public RegistroOrcamento(HttpAdapter http) {
		this.http = http;
	}
	
	public void registar(Orcamento orcamento) {
		if(!orcamento.isFinalizado()) {
			throw new OrcamentoException("O orçamento não está finalizado ");
		}
		
		String url = "http://api-externa";
		Map<String, Object> dados = new HashMap<>();
		dados.put("valor", orcamento.getValor());
		dados.put("itens", orcamento.getTotalItens());
		
		http.post(url , dados);
	}
}
