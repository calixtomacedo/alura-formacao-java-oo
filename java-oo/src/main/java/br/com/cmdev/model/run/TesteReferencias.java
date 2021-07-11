package br.com.cmdev.model.run;

import br.com.cmdev.model.Conta;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(123, 365800);
		primeiraConta.setSaldo(500);
		System.out.println("primeiraConta.saldo = "+primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		segundaConta.setSaldo(800);
		System.out.println("segundaConta.saldo = "+segundaConta.getSaldo());
		
		segundaConta.setSaldo(segundaConta.getSaldo() + 250);;
		System.out.println("segundaConta.saldo = "+segundaConta.getSaldo());
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
