package br.com.cmdev.run;

import br.com.cmdev.exceptions.CMDEVException;
import br.com.cmdev.model.ContaCorrente;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente(222, 333);
		try {
			conta.deposita(100.0);
		} catch (CMDEVException e) {
			System.out.println("Tratamento de erro checked.... "+e.getMessage());
		}
	}

}
