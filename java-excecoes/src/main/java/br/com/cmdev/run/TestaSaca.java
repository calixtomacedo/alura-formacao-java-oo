package br.com.cmdev.run;

import br.com.cmdev.exceptions.CMDEVException;
import br.com.cmdev.model.ContaCorrente;

public class TestaSaca {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(111, 222);
		try {
			contaCorrente.deposita(200.0);
			contaCorrente.saca(210.0);
		} catch (CMDEVException e) {
			System.out.println("Erro ao sacar: "+ e.getMessage());
		}
		
		System.out.println(contaCorrente.getSaldo());
	}

}
