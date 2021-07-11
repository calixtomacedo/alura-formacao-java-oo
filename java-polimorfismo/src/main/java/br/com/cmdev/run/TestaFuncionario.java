package br.com.cmdev.run;

import br.com.cmdev.model.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario calixto = new Funcionario();
		calixto.setNome("Calixto Macedo");
		calixto.setCpf("022.336.558-42");
		calixto.setSalario(9800.00);
		
		System.out.println(calixto.getNome());
		System.out.println(calixto.getBonificacao());
	}

}
