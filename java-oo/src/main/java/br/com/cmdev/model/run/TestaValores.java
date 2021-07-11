package br.com.cmdev.model.run;

import br.com.cmdev.model.Conta;

public class TestaValores {
	
	 public static void main(String[] args) {
		Conta conta = new Conta(123, 365800);
		
		//conta.setAgencia(-50);
		//conta.setNumero(-350);
		
		System.out.println("Agência: "+conta.getAgencia() + ", Número: "+conta.getNumero());
		
		Conta conta2 = new Conta(123, 365801);
		System.out.println(conta2.getNumero());
		
		Conta conta3 = new Conta(123, 365802);
		System.out.println(conta3.getNumero());
		
		System.out.println("Total de contas: "+Conta.getTotal());
	}

}
