package br.com.cmdev.run;

import br.com.cmdev.model.Gerente;

public class TestaGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		
		gerente.setNome("Calixto Macedo");
		gerente.setCpf("055.221.400-96");
		gerente.setSalario(5000.00);
		gerente.setSenha(123456);
		
		boolean autentica = gerente.autentica(25514);
		System.out.println(autentica);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());
		
	}

}
