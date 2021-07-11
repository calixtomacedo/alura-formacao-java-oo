package br.com.cmdev.javamoderno.model;

/**
 * @author calixto.macedo
 *
 */
/**
 * @author calixto.macedo
 *
 */
public class Curso {

	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}
