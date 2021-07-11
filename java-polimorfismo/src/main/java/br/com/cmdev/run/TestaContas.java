package br.com.cmdev.run;

import br.com.cmdev.model.ContaCorrente;
import br.com.cmdev.model.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(0000, 123456);
		cc.deposita(200);
		
		ContaPoupanca cp = new ContaPoupanca(1111, 654321);
		cp.deposita(500);
		
		cc.transfere(50, cp);
		
		System.out.println("Conta Corrente: "+ cc.getSaldo());
		System.out.println("Conta Poupanca: "+ cp.getSaldo());
		
	}

}

