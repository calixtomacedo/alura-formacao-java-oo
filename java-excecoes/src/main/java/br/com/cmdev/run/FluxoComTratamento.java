package br.com.cmdev.run;

import br.com.cmdev.exceptions.CMDEVException;
import br.com.cmdev.model.Conta;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Inicio do método main");
		try {
			metodoUm();
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Erro ocorrido: " + e.getMessage());
		}
		System.out.println("Fim do método main");
	}

	private static void metodoUm() {
		System.out.println("Inicio do método metodo Um");
		metodoDois();
		System.out.println("Fim do método metodo Um");
	}

	@SuppressWarnings("null")
	private static void metodoDois() {
		System.out.println("Inicio do método metodo Dois");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = 1 / 0;
			Conta conta = null;
			try {
				conta.deposita(a);
			} catch (CMDEVException e) {
				System.out.println("Tratamento de erro checked.... "+e.getMessage());
			}
		}
		System.out.println("Fim do método metodo Dois");
	}

}
