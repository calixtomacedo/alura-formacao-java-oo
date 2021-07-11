package br.com.cmdev.javaejavautil.model;


import br.com.cmdev.javaejavautil.Tributavel;
import br.com.cmdev.javaejavautil.exceptions.CMDEVException;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws CMDEVException {
		double valorMasTaxaACobrar = valor + 0.2;
		super.saca(valorMasTaxaACobrar);
	}

	public void deposita(double valor) throws CMDEVException {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente: "+ super.toString();
	}
}
