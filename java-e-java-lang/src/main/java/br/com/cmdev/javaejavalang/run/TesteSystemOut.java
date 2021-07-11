package br.com.cmdev.javaejavalang.run;

import br.com.cmdev.javaejavalang.model.Cliente;
import br.com.cmdev.javaejavalang.model.ContaCorrente;
import br.com.cmdev.javaejavalang.model.ContaPoupanca;

public class TesteSystemOut {

	public static void main(String[] args) {
		
		System.out.println("X");
		System.out.println(3);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(11, 22);
		ContaPoupanca cp = new ContaPoupanca(33, 44);
		Cliente cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		TesteSystemOut.println(cliente);

	}
	
	public static void println() {}
	public static void println(int i) {}
	public static void println(String s) {}
	public static void println(boolean b) {}
	public static void println(Object object) {}

}
