package br.com.cmdev.javacollections.exercicios;

import java.util.Comparator;

import br.com.cmdev.javacollections.model.Funcionario;

public class OrdenaPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
		return funcionario.getIdade() - outroFuncionario.getIdade();
	}
}
