package br.com.cmdev.javamoderno.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringsAnonymousClass {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

		palavras.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length()) {
					return -1;
				}
				if (s1.length() > s2.length()) {
					return 1;
				}
				return 0;
			}
		});

		System.out.println(palavras);

		System.out.println("\n");
		for (String p : palavras) {
			System.out.println(p);
		}

		System.out.println("\n");
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
	}

}