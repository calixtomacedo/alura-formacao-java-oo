package br.com.cmdev.javamoderno.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenaStringsMethodReferences {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		//palavras.sort(Comparator.comparing(s -> s.length()));
		//palavras.sort(Comparator.comparing(String::length));
		
		/*
		Function<String, Integer> function = new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		*/
		
		Function<String, Integer> function = String::length;
		Comparator<String> comparator = Comparator.comparing(function);
		palavras.sort(comparator);

		System.out.println(palavras);

		System.out.println("\n");
		for (String p : palavras) {
			System.out.println(p);
		}

		System.out.println("\n");
		//palavras.forEach(palavra -> System.out.println(palavra));
		palavras.forEach(System.out::println);
	}

}