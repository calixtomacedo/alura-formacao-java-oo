package br.com.cmdev.javacollections.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.cmdev.javacollections.model.Aula;
import br.com.cmdev.javacollections.model.Curso;

public class TestaCurso2 {
	
public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		//List<Aula> aulas = javaColecoes.getAulas();
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		ArrayList<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}

}
