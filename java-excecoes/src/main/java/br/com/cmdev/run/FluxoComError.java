package br.com.cmdev.run;

public class FluxoComError {

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

	private static void metodoDois() {
		System.out.println("Inicio do método metodo Dois");
		metodoDois();
		System.out.println("Fim do método metodo Dois");
	}
	

}
