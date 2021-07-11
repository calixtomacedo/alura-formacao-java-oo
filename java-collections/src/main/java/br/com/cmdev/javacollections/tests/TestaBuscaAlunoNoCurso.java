package br.com.cmdev.javacollections.tests;

import br.com.cmdev.javacollections.model.Aluno;
import br.com.cmdev.javacollections.model.Aula;
import br.com.cmdev.javacollections.model.Curso;

public class TestaBuscaAlunoNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno aluno1 = new Aluno("Rodrigo Turini", 34672);
		Aluno aluno2 = new Aluno("Guilherme Silveira", 5617);
		Aluno aluno3 = new Aluno("Mauricio Aniche", 17645);
		Aluno aluno4 = new Aluno("Paulo Silveira", 5617);

		javaColecoes.matricula(aluno1);
		javaColecoes.matricula(aluno2);
		javaColecoes.matricula(aluno3);
		javaColecoes.matricula(aluno4);

		System.out.println("Quem é o aluno com matricula 5617? ");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		Aluno alunoM = javaColecoes.buscaMatriculadoMap(5617);
		System.out.println("Aluno: " + aluno);
		System.out.println("AlunoM: " + alunoM);
	}
}
