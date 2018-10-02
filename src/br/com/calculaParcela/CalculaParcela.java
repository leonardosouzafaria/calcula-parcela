package br.com.calculaParcela;

import br.com.calculaParcela.model.GerenciadorDeVendas;
import br.com.calculaParcela.model.Venda;

public class CalculaParcela {

	public static void main(String[] args) {

		int pecas = 3;
		double preco = 12.00;
		int parcela = 2;

		// Registrando uma venda
		Venda venda = new Venda(pecas, preco, parcela);
		
		GerenciadorDeVendas gerenciadorDeVendas = new GerenciadorDeVendas(venda);
		
		System.out.println(gerenciadorDeVendas);
		
	}

}
