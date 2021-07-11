package br.com.cmdev.run;

import br.com.cmdev.exceptions.CMDEVException;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do método main");
		try {
			metodoUm();
		} catch (Exception e) {
			System.out.println("Erro ocorrido: " + e.getMessage());
		}
		System.out.println("Fim do método main");
	}

	private static void metodoUm() throws CMDEVException {
		System.out.println("Inicio do método metodo Um");
		metodoDois();
		System.out.println("Fim do método metodo Um");
	}

	private static void metodoDois() throws CMDEVException {
		System.out.println("Inicio do método metodo Dois");
		//throw new ArithmeticException("Erro");
		throw new CMDEVException("Ocorreu algo muito errado");
	}

}
