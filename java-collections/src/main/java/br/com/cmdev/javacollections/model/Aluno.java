package br.com.cmdev.javacollections.model;

public class Aluno {

	private String nome;
	private Integer numeroMatricula;

	public Aluno(String nome, Integer numeroMatricula) {
		if(nome == null || nome.isBlank() || nome.length() < 1) {
			throw new NullPointerException("O campo nome é obrigatório");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public int hashCode() {
		//return this.nome.charAt(0);
		return this.nome.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public String toString() {
		return "Aluno: [nome = " + this.nome + ", numeroMatricula = " + this.numeroMatricula + "]";
	}
}
