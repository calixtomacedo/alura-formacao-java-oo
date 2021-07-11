package br.com.cmdev.model.run;

import br.com.cmdev.model.Conta;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoCalixto = new Conta(123, 365800);
		
		contaDoCalixto.setSaldo(100);
		System.out.println(contaDoCalixto.getSaldo());
		
		contaDoCalixto.deposita(250);
		System.out.println(contaDoCalixto.getSaldo());
		
		
		boolean ok = contaDoCalixto.saca(340);
		System.out.println("Saque autorizado = "+ok);
		System.out.println(contaDoCalixto.getSaldo());
		
		
		Conta contaDaMarcela = new Conta(123, 365800);
		contaDaMarcela.setSaldo(1000);
		
		boolean transfenciaComSucesso = contaDaMarcela.transfere(300, contaDoCalixto);
		if (!transfenciaComSucesso) {
			System.err.println("Saldo insuficiente");
		}
		System.out.println("Transfencia com sucesso = "+transfenciaComSucesso);
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoCalixto.getSaldo());
		
	}
}
