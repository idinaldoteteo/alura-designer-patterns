package br.com.alura.strategy;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		System.out.println(orcamento.calcularImposto(new ISS()));
		
	}
}
