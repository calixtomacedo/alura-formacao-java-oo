package br.com.cmdev.model;

public class CalculadorDeImposto {
	
	
	private double valorTotalImposto;
	
	public void calcula(Tributavel tributavel) {
		double valorImposto = tributavel.getValorImposto();
		this.valorTotalImposto += valorImposto;
	}

	public double getTotalImposto() {
		return this.valorTotalImposto;
	}

}
