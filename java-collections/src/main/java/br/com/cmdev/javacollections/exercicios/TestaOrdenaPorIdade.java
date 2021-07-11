package br.com.cmdev.javacollections.exercicios;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import br.com.cmdev.javacollections.model.Funcionario;

public class TestaOrdenaPorIdade {

	public static void main(String args[]) {

		Funcionario f1 = new Funcionario("Barney", 12);
		Funcionario f2 = new Funcionario("Jonatan", 9);
		Funcionario f3 = new Funcionario("Guaraciara", 13);

		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);

		Iterator<Funcionario> iterador = funcionarios.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}
	}

}
