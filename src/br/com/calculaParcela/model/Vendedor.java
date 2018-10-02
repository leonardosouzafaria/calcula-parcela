package br.com.calculaParcela.model;

public class Vendedor {
	private double comissao;
	
	public Vendedor(double valorTotal) {
		this.setComissao(valorTotal);
	}


	public double getComissao() {
		return comissao;
	}

	public void setComissao(double valorTotal) {
		this.comissao = (valorTotal * 5)/100;
		
	}
}
