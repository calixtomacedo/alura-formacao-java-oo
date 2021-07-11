package br.com.cmdev.javacollections.tests;

import java.util.List;

import br.com.cmdev.javacollections.model.Aula;
import br.com.cmdev.javacollections.model.Curso;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);
		
		//aulas.add(new Aula("Trabalhando com ArrayList", 21));
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getAulas());
	}

}
