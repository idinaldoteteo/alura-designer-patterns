package br.com.alura.adapter;

import java.util.Map;

public interface HttpAdapter {
	
	void post(String url, Map<String, Object> dados);
	
}
