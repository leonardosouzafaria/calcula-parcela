package br.com.calculaParcela.model;

public class GerenciadorDeVendas {
	private double valorComissao;
	private double valorParcela;
	
	public GerenciadorDeVendas(Venda venda) {
		this.setValorComissao(venda.getVendedor().getComissao());
		this.setValorParcela(venda.getParcela(), venda.getValorTotal());
	}

	public double getValorComissao() {
		return valorComissao;
	}

	public void setValorComissao(double valorComissao) {
		this.valorComissao = valorComissao;
	}

	public double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(int parcela, double valorTotal) {
		
		this.valorParcela = valorTotal / parcela;
	}
	
	@Override
	public String toString() {
		return "Valor da comissao: " +  getValorComissao() + " com parcelas de: " + getValorParcela() + " reais";
	}
}
