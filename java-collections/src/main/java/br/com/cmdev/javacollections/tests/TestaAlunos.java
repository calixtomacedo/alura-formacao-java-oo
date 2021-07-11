package br.com.cmdev.javacollections.tests;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean isAlunoCalixto = alunos.contains("Calixto Macedo");
		System.out.println(isAlunoCalixto);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("\n");
		
		alunos.forEach(aluno -> System.out.println(aluno));

		System.out.println("\n");
		System.out.println(alunos);
	}
}
