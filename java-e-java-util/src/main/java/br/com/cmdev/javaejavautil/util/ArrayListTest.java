package br.com.cmdev.javaejavautil.util;

import java.util.ArrayList;

import br.com.cmdev.javaejavautil.model.Conta;
import br.com.cmdev.javaejavautil.model.ContaCorrente;

public class ArrayListTest {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		//Cliente cliente = new Cliente();
		//lista.add(cliente);
		
		ContaCorrente conta0 = new ContaCorrente(222, 123456789);
		ContaCorrente conta1 = new ContaCorrente(222, 987456321);

		lista.add(conta0);
		lista.add(conta1);
		
		ContaCorrente conta2 = new ContaCorrente(222, 10203040);
		ContaCorrente conta3 = new ContaCorrente(222, 01020304);
		
		//Conta cc = (Conta) lista.get(0);
		Conta cc = lista.get(0);
		System.out.println(cc.getNumero());

		lista.add(conta2);
		lista.add(conta3);


		System.out.println("Tamanho da Lista: " + lista.size());
		lista.remove(0);
		System.out.println("Tamanho da Lista: " + lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println(" \n------------------------- \n");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		/*
		for (Object object : lista) {
			System.out.println(object);
		}
		*/

	}

}
