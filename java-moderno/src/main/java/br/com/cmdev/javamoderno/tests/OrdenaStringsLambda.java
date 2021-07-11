package br.com.cmdev.javamoderno.tests;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStringsLambda {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(palavras);

		System.out.println("\n");
		for (String p : palavras) {
			System.out.println(p);
		}

		System.out.println("\n");
		palavras.forEach(palavra -> System.out.println(palavra));
	}

}