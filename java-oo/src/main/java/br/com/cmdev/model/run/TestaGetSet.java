package br.com.cmdev.model.run;

import br.com.cmdev.model.Conta;

public class TestaGetSet {

	public static void main(String[] args) {

		Conta conta = new Conta(123, 365800);
		//conta.setNumero(1234);
		System.out.println(conta.getNumero());
	}

}
