package br.com.cmdev.javacollections.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matruculaParaAluno = new HashMap<>();
	//private Map<Integer, Aluno> matruculaParaAluno = new LinkedHashMap<>();
	//private Map<Integer, Aluno> matruculaParaAluno = new Hashtable<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public Integer getTempoTotal() {
		/*
		Integer tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
		*/
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matruculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public Boolean isAlunoMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	@Override
	public String toString() {
		return "Curso: " + this.nome + ", Tempo total: " + this.getTempoTotal() +", aulas: " + this.aulas.toString();
	}

	public Aluno buscaMatriculado(Integer matricula) {
		for (Aluno aluno : alunos) {
			if(aluno.getNumeroMatricula().equals(matricula)) {
				return aluno;
			}
		}
		throw new NoSuchElementException("Matricula não encotrada: "+matricula);
	}
	
	public Aluno buscaMatriculadoMap(Integer matricula) {
		if(!this.matruculaParaAluno.containsKey(matricula)) {
			throw new NoSuchElementException("Matricula não encotrada: "+matricula);
		}
		return this.matruculaParaAluno.get(matricula);
	}

}
