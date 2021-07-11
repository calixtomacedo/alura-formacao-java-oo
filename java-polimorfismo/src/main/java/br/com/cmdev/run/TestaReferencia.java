package br.com.cmdev.run;

import br.com.cmdev.model.Funcionario;
import br.com.cmdev.model.Gerente;

public class TestaReferencia {

	public static void main(String[] args) {

		//Gerente gerente = new Gerente();
		Funcionario gerente = new Gerente();
		gerente.setNome("Calixto Macedo");
		String nome = gerente.getNome();

		System.out.println(nome);
		
	}

}
