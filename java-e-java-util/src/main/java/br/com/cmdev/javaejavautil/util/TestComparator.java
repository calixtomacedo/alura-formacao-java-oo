package br.com.cmdev.javaejavautil.util;

import java.util.ArrayList;

import br.com.cmdev.javaejavautil.model.Conta;
import br.com.cmdev.javaejavautil.model.ContaCorrente;

public class TestComparator {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Conta conta0 = new ContaCorrente(77, 99);
		lista.add(conta0);

		Conta conta1 = new ContaCorrente(33, 22);
		lista.add(conta1);
		
		Conta conta2 = new ContaCorrente(44, 66);
		lista.add(conta2);
		
		Conta conta3 = new ContaCorrente(11, 11);
		lista.add(conta3);
		
		Conta conta4 = new ContaCorrente(22, 55);
		lista.add(conta4);

		Conta conta5 = new ContaCorrente(55, 33);
		lista.add(conta5);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println("\n");
		
		lista.sort(new NumeroContasComparator());
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
