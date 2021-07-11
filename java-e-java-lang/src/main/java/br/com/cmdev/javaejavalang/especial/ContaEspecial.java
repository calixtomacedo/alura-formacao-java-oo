package br.com.cmdev.javaejavalang.especial;

import br.com.cmdev.javaejavalang.exceptions.CMDEVException;
import br.com.cmdev.javaejavalang.model.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) throws CMDEVException {
		super.saldo += valor;
	}

}
