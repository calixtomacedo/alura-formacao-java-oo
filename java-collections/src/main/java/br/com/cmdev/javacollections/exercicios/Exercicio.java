package br.com.cmdev.javacollections.exercicios;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {
	public static void main(String[] args) {

		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");

		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
		
		System.out.println("\n");
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});

	}
}
