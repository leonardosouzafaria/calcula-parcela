package br.com.calculaParcela.model;

public class Venda {
	private int quantidadePecas;
	private double valorTotal;
	private double desconto;
	private int parcela;
	private Vendedor vendedor;

	public Venda(int quantidadePecas, double valorTotal, int parcela) {
		this.setQuantidadePecas(quantidadePecas);
		this.setValorTotal(valorTotal);
		this.setParcela(parcela);
		this.setDesconto(quantidadePecas, valorTotal);
		this.vendedor = new Vendedor((valorTotal - desconto));
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	private void setDesconto(int quantidadePecas, double valorTotal) {

		if (quantidadePecas > 3) {
			this.desconto = (valorTotal * 10) / 100;
		}

	}

	public int getQuantidadePecas() {
		return quantidadePecas;
	}

	public void setQuantidadePecas(int quantidadePecas) {
		this.quantidadePecas = quantidadePecas;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}
}
