package br.com.cmdev.javacollections.tests;

import java.util.Iterator;
import java.util.Set;

import br.com.cmdev.javacollections.model.Aluno;
import br.com.cmdev.javacollections.model.Aula;
import br.com.cmdev.javacollections.model.Curso;

public class TestaCursoComAluno2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno aluno1 = new Aluno("Rodrigo Turini", 34672);
		Aluno aluno2 = new Aluno("Guilherme Silveira", 5617);
		Aluno aluno3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(aluno1);
		javaColecoes.matricula(aluno2);
		javaColecoes.matricula(aluno3);
		
		System.out.println("Todos os alunos matriculados: ");

		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			Aluno nextAluno = iterator.next();
			System.out.println("Com iterator: "+nextAluno);
		}
		
		System.out.println("\nO aluno " + aluno1 + " está matriculado? "+ javaColecoes.isAlunoMatriculado(aluno1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("O aluno " + aluno1 + " está matriculado? "+ javaColecoes.isAlunoMatriculado(turini));

		System.out.println("O aluno1 é equals ao Turini? " + aluno1.equals(turini));

		System.out.println("aluno1: "+ aluno1.hashCode()+" turini: "+turini.hashCode());
		
		System.out.println("HashCode igual? " + (aluno1.hashCode() == turini.hashCode()));
		
	}
}
