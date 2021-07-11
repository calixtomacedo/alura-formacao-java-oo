package br.com.cmdev.javaejavautil.util;

import java.util.ArrayList;

import br.com.cmdev.javaejavautil.model.Conta;
import br.com.cmdev.javaejavautil.model.ContaCorrente;

public class ArrayListEqualsTest {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta conta0 = new ContaCorrente(222, 123456789);
		lista.add(conta0);

		Conta conta1 = new ContaCorrente(222, 987456321);
		lista.add(conta1);
		
		Conta conta3 = new ContaCorrente(222, 123456789);
		
		boolean existe = lista.contains(conta3);
		
		System.out.println("Já existe essa conta: "+ existe);
		
	}
}
