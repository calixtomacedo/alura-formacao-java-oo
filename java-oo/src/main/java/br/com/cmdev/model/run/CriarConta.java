package br.com.cmdev.model.run;

import br.com.cmdev.model.Conta;

public class CriarConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(123, 365800);
		primeiraConta.setSaldo(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.setSaldo(primeiraConta.getSaldo() + 800);
		System.out.println(primeiraConta.getSaldo());
		
		
		Conta segundaConta = new Conta(123, 365800);
		segundaConta.setSaldo(50);
		
		System.out.println("primeiraConta: "+primeiraConta.getSaldo());
		System.out.println("segundaConta: "+segundaConta.getSaldo());
	}

}

