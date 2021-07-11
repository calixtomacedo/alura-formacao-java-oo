package br.com.cmdev.javaejavautil.run;

import br.com.cmdev.javaejavautil.model.Cliente;
import br.com.cmdev.javaejavautil.model.ContaCorrente;
import br.com.cmdev.javaejavautil.model.ContaPoupanca;

public class TestArrayDeReferencias {

	public static void main(String[] args) {
		
		//ContaCorrente[] contas = new ContaCorrente[5];
		//Conta[] contas = new Conta[5];
		Object[] referencias = new Object[5];
		ContaCorrente cc1 = new ContaCorrente(0111, 123456);
		referencias[0] = cc1;

		//ContaCorrente cc2 = new ContaCorrente(0111, 654321);
		ContaPoupanca cc2 = new ContaPoupanca(0111, 654321);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(contas[0].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		
	}

}
